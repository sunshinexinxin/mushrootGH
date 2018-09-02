package com.hyx.apps.monitoringcenter.controller;

import com.hyx.apps.monitoringcenter.bean.MonitoringCenter;
import com.hyx.apps.monitoringcenter.service.MonitorManagementService;
import com.hyx.common.ResponseBean;
import com.hyx.tools.CommonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:监控中心模块
 * @author: anke
 * @date: 2018/7/7
 */
@Controller
@RequestMapping(value = "/mushRoomGH")
@Api(description = "监控中心Controller")
public class MonitoringCenterCrontroller {
    protected final Logger logger = Logger.getLogger(MonitoringCenterCrontroller.class);


    /**
     * 上传视频截图
     *
     * @return
     */
    @Autowired
    private MonitorManagementService monitorManagementService;


    @ResponseBody
    @RequestMapping(value = "/sendCanvasIamge", method = RequestMethod.POST)
    @ApiOperation(value = "上传视频截图", response = ResponseBean.class)
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
    @ResponseBody
    @RequestMapping(value = "/seeHistorImages", method = RequestMethod.GET)
    @ApiOperation(value = "查看历史视频截图", response = ResponseBean.class)
    public ResponseBean seeHistorImages(HttpServletRequest request) {
        //TODO 遗留
        String userId = "22010001";
        List<MonitoringCenter> images = monitorManagementService.getImagesById(userId);
        if (images != null && images.size() == 0) {
            return new ResponseBean("201", "无数据");
        }
        return new ResponseBean(images);
    }

    /**
     * 监控中心-实时视频页面
     *
     * @return
     */
    @RequestMapping(value = "/realTimeCameraPage", method = RequestMethod.GET)
    @ApiOperation(value = "实时视频页面", response = String.class)
    public String cameraPage() {
        return "/sence/realTimeCamera";
    }

    /**
     * 监控中心-历史视频截图页面
     *
     * @return
     */
    @RequestMapping(value = "/seeHistorImagesPage", method = RequestMethod.GET)
    @ApiOperation(value = "历史视频截图页面", response = String.class)
    public String seeHistorImagesPage() {
        return "/sence/seeHistorImage";
    }
}
