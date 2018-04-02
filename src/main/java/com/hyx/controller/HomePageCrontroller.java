package com.hyx.controller;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.login.service.UserService;
import com.hyx.tools.Md5Utils;
import com.hyx.tools.StrKit;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

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
//    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

    @Autowired
    private UserService service;

    @RequestMapping(value = "/login")
    public String login(String userName, String userPwd) {
        if (StrKit.isBlank(userName)) {
            return "/login/login";
        }
        logger.info("前台数据：用户名：" + userName + "'\t密码：" + userPwd);
        try {
            User user = service.getUserByName(userName.trim());
            logger.info("根据输入用户名查询结果：" + user);
            if (user != null) {
                if (userPwd != null) {
                    if (user.getUserPsd().equals(Md5Utils.MD5Encode(userPwd))) {
                        try {
                            //设置session.
                            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
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

    /***地图首页
     *
     * @return
     */
    @RequestMapping(value = "/mushRoomMapPage", method = RequestMethod.GET)
    public String mapPage() {
        return "/sence/mushRoomMap";
    }


    /**
     * 饼图展示
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/echarts_bingtu")
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
    @RequestMapping(value = "/echarts_temp_wetPage")
    public String echarts_temp_wet() {
        return "/sence/charts/echarts_temp_wet";
    }

    /***个人中心 请求页面
     *
     * @return
     */
    @RequestMapping(value = "/userInfoPage", method = RequestMethod.GET)
    public String userInfo() {
        return "/sence/userInfo";
    }
}
