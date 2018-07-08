package com.hyx.apps.login.controller;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.login.service.UserService;
import com.hyx.tools.Md5Utils;
import com.hyx.tools.StrKit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author anke
 * @description:用户信息，登录模块
 * @date 2018/7/7
 */
@Controller
@RequestMapping("/mushRoomGH")
@Api(description = "登录信息Controller")
public class LoginController {
    protected final Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    private UserService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "登录操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "用户名", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "userPwd", value = "密码", dataType = "String", paramType = "query", required = true)
    })
    public String login(String userName, String userPwd, HttpServletRequest request) {
        if (StrKit.isBlank(userName)) {
            return "/login/login";
        }
        try {
            User user = service.getUserByName(userName.trim());
            logger.info("根据输入用户名查询结果：" + user);
            if (user != null) {
                if (userPwd != null) {
                    if (user.getUserPsd().equals(Md5Utils.MD5Encode(userPwd))) {
                        try {
                            //设置session.
                            request.getSession().setAttribute("userName", user.getUserName());
                            request.getSession().setAttribute("userId", user.getUserId());
                            request.getSession().setAttribute("userBean", user);
                            logger.info(user.getUserName() + " 登录成功！");
                            return "sence/mainHome";
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        logger.info("密码输入错误！");
                    }
                } else {
                    logger.info("用户密码出错，请联系管理员！");
                }
            } else {
                logger.info("用户名错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "login/login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "登出操作")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("userId");
        return "login/login";
    }
}
