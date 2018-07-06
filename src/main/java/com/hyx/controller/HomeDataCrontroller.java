package com.hyx.controller;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.sence.bean.ChartsCollectionBean;
import com.hyx.apps.sence.bean.Monitor;
import com.hyx.apps.sence.bean.MonitorManagement;
import com.hyx.apps.sence.service.BackStageManagementService;
import com.hyx.apps.sence.service.ChartsService;
import com.hyx.apps.sence.service.MapService;
import com.hyx.apps.sence.service.MonitorManagementService;
import com.hyx.common.ResponseBean;
import com.hyx.tools.CommonUtil;
import com.hyx.tools.StrKit;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2018/3/25
 */
@RestController
@RequestMapping(value = "/mushRoomGH")
public class HomeDataCrontroller {
    protected final Logger logger = Logger.getLogger(HomeDataCrontroller.class);
    @Autowired
    private MapService mapService;

    /***展示地图数据
     *
     * @return
     */
    @RequestMapping(value = "/mushRoomMapData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "获取地图数据", response = ResponseBean.class)
    public ResponseBean mushRoomMapData(@ApiParam(required = true) String userId) {
        List<Monitor> mushRoomList = mapService.getMapDataByUserId("22010001"); //TODO 该出需要修改成获取值
        List resuList = new ArrayList();
        for (int i = 0; i < mushRoomList.size(); i++) {
            List resuLists = new ArrayList();
            resuLists.add("\"" + mushRoomList.get(i).getMushroomLat() + "\"");
            resuLists.add("\"" + mushRoomList.get(i).getMushroomLong() + "\"");
            resuLists.add("\"" + mushRoomList.get(i).getMushroomName() + "\"");
            resuList.add(resuLists);
        }
        return new ResponseBean(resuList.toString());
    }

    /***个人中心
     *
     * @return
     */
    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public ResponseBean userInfo() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String userId = request.getSession().getAttribute("userId").toString();
        logger.info("从session获取userID:" + userId);
        if (StrKit.isBlank(userId)) {
            return new ResponseBean();
        }
        try {
            List<Monitor> userInfoList = mapService.getMapDataByUserId(userId);
            logger.info("userInfoList:" + userInfoList);
            return new ResponseBean(userInfoList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseBean();
    }

    /**
     * 数据报表统计-温度展示
     *
     * @return
     */
    @Autowired
    private ChartsService chartsService;

    @RequestMapping(value = "/echarts_temp_wetData", method = RequestMethod.GET)
    public ResponseBean echarts_temp_wet() {  //TODO 该方法的逻辑还有问题，js页面需要修改
        List<ChartsCollectionBean> tempWetList = chartsService.getTempWetListById("00011"); //TODO 该出需要修改成获取值
        return new ResponseBean(tempWetList);
    }

    /**
     * 上传视频截图
     *
     * @return
     */
    @Autowired
    private MonitorManagementService monitorManagementService;

    @RequestMapping(value = "/sendCanvasIamge", method = RequestMethod.POST)
    public ResponseBean sendCanvasIamge(String image, String imgName, String imgMushRoom, String imgTime, String imgBase, String imgUserName, String imgUserId, String imgMess) throws IOException {
        logger.info(imgName + "\t" + imgTime + "\t" + imgBase + "\t" + imgMushRoom + "\t" + imgUserName + "\t" + imgUserId + "\t" + imgMess);
        String time = CommonUtil.formatdate19(CommonUtil.str2data(imgTime));
        Map<String, String> mapStore = new HashMap<>(16);
        mapStore.put("imgBase", imgBase);
        mapStore.put("imgContent", image);
        mapStore.put("imgName", imgName);
        mapStore.put("userName", imgUserName);
        mapStore.put("userId", imgUserId);
        mapStore.put("delFlag", "0");
        mapStore.put("ctime", time);

        Integer ins = monitorManagementService.storeImage(mapStore);
        return new ResponseBean(ins);
    }

    /**
     * 查看历史视频截图
     *
     * @return
     */
    @RequestMapping(value = "/seeHistorImages", method = RequestMethod.GET)
    public ResponseBean seeHistorImages() {
        List<MonitorManagement> images = monitorManagementService.getImagesById("22010001"); //TODO 遗留
        if (images != null && images.size() == 0) {
            return new ResponseBean("201", "无数据");
        }
        return new ResponseBean(images);
    }

    @Autowired
    private BackStageManagementService backStageManagementService;

    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    public ResponseBean getUsers(String status, String userID) {
        List<User> usersList = backStageManagementService.getUsersList(userID, status);
        if (usersList == null) {
            return new ResponseBean("201", "无数据");
        }
        return new ResponseBean(usersList);
    }
}
