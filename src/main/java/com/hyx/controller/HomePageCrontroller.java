package com.hyx.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author anke
 * @date 2018/3/21
 */
//这个注解不能使用RestController，不然不会返回模板类型的页面
@Controller
@RequestMapping(value = "/mushRoomGH")
public class HomePageCrontroller {
    protected final Logger logger = Logger.getLogger(HomePageCrontroller.class);





    /**
     * 饼图展示
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/echarts_bingtu", method = RequestMethod.GET)
    public String echarts_bingtu(HttpServletRequest request) {
        String lat = request.getParameter("lat");
        String lng = request.getParameter("lng");
        return "sence/charts/echarts_bingtu";
    }

    /**
     * 温度折线图展示
     *
     * @return
     */
    @RequestMapping(value = "/echarts_temp_wetPage", method = RequestMethod.GET)
    public String echarts_temp_wet() {
        return "/sence/charts/echarts_temp_wet";
    }

    /***
     * 个人中心页面
     *
     * @return
     */
    @RequestMapping(value = "/userInfoPage", method = RequestMethod.GET)
    public String userInfo() {
        return "/sence/userInfo";
    }


    /**
     * 监控中心-实时视频页面
     *
     * @return
     */
    @RequestMapping(value = "/realTimeCameraPage", method = RequestMethod.GET)
    public String cameraPage() {
        return "/sence/realTimeCamera";
    }

    /**
     * 监控中心-历史视频截图页面
     *
     * @return
     */
    @RequestMapping(value = "/seeHistorImagesPage", method = RequestMethod.GET)
    public String seeHistorImagesPage() {
        return "/seeHistorImagesPage";
    }

    /**
     * 系统后台管理-系统用户配置
     *
     * @return
     */
    @RequestMapping(value = "/addUserPage", method = RequestMethod.GET)
    public String usersManage() {
        return "/sence/addUsers";
    }

}
