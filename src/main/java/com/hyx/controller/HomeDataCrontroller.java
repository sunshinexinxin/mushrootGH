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
            resuLists.add("\"" + mushRoomList.get(i).getMushroomLat() + "\"");
            resuLists.add("\"" + mushRoomList.get(i).getMushroomLong() + "\"");
            resuLists.add("\"" + mushRoomList.get(i).getMushroomName() + "\"");
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
        List<ChartsCollectionBean> tempWetList = chartsService.getTempWetListById("00011"); //TODO 该出需要修改成获取值
        resuData.setData(tempWetList);
        return resuData;
    }
}
