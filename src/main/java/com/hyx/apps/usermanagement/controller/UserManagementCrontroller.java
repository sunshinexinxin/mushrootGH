package com.hyx.apps.usermanagement.controller;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.usermanagement.service.UserManagementService;
import com.hyx.common.ResponseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
@Controller
@RequestMapping(value = "/mushRoomGH")
@Api(description = "系统后台管理")
public class UserManagementCrontroller {
    protected final Logger logger = Logger.getLogger(UserManagementCrontroller.class);


    @Autowired
    private UserManagementService userManagementService;

    @ResponseBody
    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    @ApiOperation(value = "系统用户配置", response = ResponseBean.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userID", value = "用户ID", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "status", value = "用户状态", dataType = "String", paramType = "query", required = true),
    })
    public ResponseBean getUsers(String userID, String status) {
        List<User> usersList = userManagementService.getUsersList(userID, status);
        if (usersList == null) {
            return new ResponseBean("201", "无数据");
        }
        return new ResponseBean(usersList);
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
