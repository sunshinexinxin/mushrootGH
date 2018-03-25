package com.hyx.controller;

import com.hyx.apps.login.bean.ResuData;
import com.hyx.apps.sence.bean.ChartsCollectionBean;
import com.hyx.apps.sence.bean.Monitor;
import com.hyx.apps.sence.service.ChartsService;
import com.hyx.apps.sence.service.MapService;
import com.hyx.tools.StrKit;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
@RestController
@RequestMapping(value = "/mushRoomGH")
public class HomeDataCrontroller {
    protected final Logger logger = Logger.getLogger(HomeDataCrontroller.class);
    HttpServletRequest request;
    ResuData resuData = new ResuData();
    @Autowired
    private MapService mapService;

    /***展示地图数据
     *
     * @return
     */
    @RequestMapping(value = "/mushRoomMapData")
    public ResuData mushRoomMapData() {
        List<Monitor> mushRoomList = mapService.getMapDataByUserId("22010001"); //TODO 该出需要修改成获取值
        List resuList = new ArrayList();
        for (int i = 0; i < mushRoomList.size(); i++) {
            List resuLists = new ArrayList();
            resuLists.add(mushRoomList.get(i).getMushroomLat());
            resuLists.add(mushRoomList.get(i).getMushroomLong());
            resuList.add(resuLists);
        }
        resuData.setData(resuList.toString());
        logger.info(resuData);
        return resuData;
    }

    /***个人中心
     *
     * @return
     */
    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public ResuData userInfo() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String userId = request.getSession().getAttribute("userId").toString();
        logger.info("从session获取userID:" + userId);
        if (StrKit.isBlank(userId)) {
            return null;
        }
        try {
            List<Monitor> userInfoList = mapService.getMapDataByUserId(userId);
            logger.info("userInfoList:" + userInfoList);
            resuData.setData(userInfoList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resuData;
    }

    /**
     * 数据报表统计-温度展示
     *
     * @return
     */
    @Autowired
    private ChartsService chartsService;

    @RequestMapping(value = "/echarts_temp_wetData", method = RequestMethod.GET)
    public ResuData echarts_temp_wet() {  //TODO 该方法的逻辑还有问题，js页面需要修改
        List<ChartsCollectionBean> tempWetList = chartsService.getTempWetListById("00020"); //TODO 该出需要修改成获取值
        //空气温度
        List<String> airTempList = new ArrayList<>();
        for (ChartsCollectionBean key : tempWetList) {
            airTempList.add(key.getMushroomAirtemp());
        }
        //空气湿度
        List<String> airhumidityList = new ArrayList<>();
        for (ChartsCollectionBean key : tempWetList) {
            airhumidityList.add(key.getMushroomAirhumidity());
        }
        //土壤温度
        List<String> soiltempList = new ArrayList<>();
        for (ChartsCollectionBean key : tempWetList) {
            soiltempList.add(key.getMushroomSoiltemp());
        }
        //土壤湿度
        List<String> soilmoistureList = new ArrayList<>();
        for (ChartsCollectionBean key : tempWetList) {
            soilmoistureList.add(key.getMushroomSoilmoisture());
        }

        //光照强度
        List<String> ightintensityList = new ArrayList<>();
        for (ChartsCollectionBean key : tempWetList) {
            ightintensityList.add(key.getMushroomIghtintensity());
        }

        //二氧化碳浓度
        List<String> co2densutyList = new ArrayList<>();
        for (ChartsCollectionBean key : tempWetList) {
            co2densutyList.add(key.getMushroomCo2densuty());
        }
        //时间
        List<String> timeList = new ArrayList<>();
        for (ChartsCollectionBean key : tempWetList) {
            String shi = key.getCtime().substring(8, 10);
            String fen = key.getCtime().substring(10, 12);
            timeList.add("'" + shi + ":" + fen + "'");
        }
        request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        request.getSession().setAttribute("airTempList", airTempList);
        request.getSession().setAttribute("airhumidityList", airhumidityList);
        request.getSession().setAttribute("soiltempList", soiltempList);
        request.getSession().setAttribute("soilmoistureList", soilmoistureList);
        request.getSession().setAttribute("ightintensityList", ightintensityList);
        request.getSession().setAttribute("co2densutyList", co2densutyList);
        request.getSession().setAttribute("timeList", timeList);
        return null;
    }
}
