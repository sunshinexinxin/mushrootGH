package com.hyx.apps.userinfo.controller;

import com.hyx.apps.map.service.MapService;
import com.hyx.apps.map.bean.Monitor;
import com.hyx.common.ResponseBean;
import com.hyx.tools.StrKit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    /**
     * 个人中心
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    @ApiOperation(value = "个人中心-用户信息", response = ResponseBean.class)
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
