package com.hyx.controller;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.login.service.UserService;
import com.hyx.tools.Md5Utils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author anke
 * @date 2018/3/21
 */
//这个注解不能使用RestController，不然会返回模板类型的页面
@Controller
@RequestMapping(value = "/mushRoomGH")
public class HomeCrontroller {
    protected final Logger logger = Logger.getLogger(HomeCrontroller.class);

    @Autowired
    private UserService service;

    @RequestMapping(value = "/login")
    public String login(String userName, String userPwd) {
        logger.info("前台数据：用户名：" + userName + "\t密码：" + userPwd);
        /**
         *
         */
        try {
            User user = service.getUserByName(userName.trim());
            logger.info("后台数据：" + user);
            if (user != null) {
                if (userPwd != null) {
                    if (user.getUserPsd().equals(Md5Utils.MD5Encode(userPwd))) {
                        try {
                            //设置session.
//                            ActionContext.getContext().getSession().put("userName", user.getUserName());
//                            ActionContext.getContext().getSession().put("userId", user.getUserId());
//                            ActionContext.getContext().getSession().put("userBean", user);
                            logger.info(user.getUserName() + " 登录成功！");
                            return "login";
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
        return "login";
    }

//    public Logger getLogger() {
//        return logger;
//    }
//
//    public UserService getService() {
//        return service;
//    }
//
//    public void setService(UserService service) {
//        this.service = service;
//    }
}
