package com.hyx.apps.userinfo.controller;

import com.hyx.apps.map.service.MapService;
import io.swagger.annotations.Api;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author anke
 * @description:个人中心模块
 * @date 2018/7/7
 */
@Controller
@RequestMapping("/mushRoomGH")
@Api(description = "个人中心Controller")
public class UserInfoController {
    protected final Logger logger = Logger.getLogger(UserInfoController.class);

    @Autowired
    private MapService mapService;



    /***
     * 个人中心页面
     *
     * @return
     */
    @RequestMapping(value = "/userInfoPage", method = RequestMethod.GET)
    public String userInfoPage() {
        return "/sence/userInfo";
    }
}
