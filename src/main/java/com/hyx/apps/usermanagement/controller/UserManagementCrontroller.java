package com.hyx.apps.usermanagement.controller;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.login.service.UserService;
import com.hyx.apps.usermanagement.service.UserManagementService;
import com.hyx.common.CodeConst;
import com.hyx.common.ResponseBean;
import com.hyx.tools.CommonUtil;
import com.hyx.tools.Md5Utils;
import com.hyx.tools.StrKit;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    @ApiOperation(value = "系统用户配置", response = ResponseBean.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "status", value = "用户状态", dataType = "String", paramType = "query", required = true),
    })
    public ResponseBean getUsers(String status) {
        if (StrKit.isBlank(status)) {
            return new ResponseBean(CodeConst.CODE_ERROR_PARAMETER_EMPTY, CodeConst.msgMap.get(CodeConst.CODE_ERROR_PARAMETER_EMPTY));
        }
        Map<String, Object> params = new HashMap<>(16);
        params.put("status", status);
        List<User> usersList = userManagementService.getUsersList(params);
        if (usersList == null) {
            return new ResponseBean(CodeConst.CODE_OK_NO_DATA, CodeConst.msgMap.get(CodeConst.CODE_OK_NO_DATA));
        }
        return new ResponseBean(usersList);
    }

    @ResponseBody
    @RequestMapping(value = "/addUsers", method = RequestMethod.POST)
    @ApiOperation(value = "添加系统用户", response = ResponseBean.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "姓名", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "userPsd", value = "密码", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "userAge", value = "年龄", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userPhone", value = "联系方式", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userAdd", value = "地址", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "用户状态", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "memo", value = "备注", dataType = "String", paramType = "query"),
    })
    public ResponseBean addUsers(String userName, String userPsd, String userAge, String userPhone, String userAdd, String status, String memo) {
        if (StrKit.isBlank(userName)) {
            return new ResponseBean(CodeConst.CODE_ERROR_PARAMETER_EMPTY, CodeConst.msgMap.get(CodeConst.CODE_ERROR_PARAMETER_EMPTY));
        }
        Map<String, Object> params = new HashMap<>(16);
        params.put("userName", userName);
        params.put("userPsd", Md5Utils.MD5Encode(userPsd));
        params.put("userAge", userAge);
        params.put("userPhone", userPhone);
        params.put("userAdd", userAdd);
        params.put("status", status);
        params.put("memo", memo);
        params.put("ctime", CommonUtil.getLocalSysTime2());
        logger.info(params);
        int integer = userManagementService.addUsers(params);
        if (integer == Integer.parseInt(CodeConst.CODE_HAD_USER_OR_CUSTOMER)) {
            return new ResponseBean(CodeConst.CODE_HAD_USER_OR_CUSTOMER, CodeConst.msgMap.get(CodeConst.CODE_HAD_USER_OR_CUSTOMER));
        } else if (integer == 1) {
            User userByName = userService.getUserByName(userName);
            return new ResponseBean(userByName);
        }
        return new ResponseBean(integer);
    }

    @ResponseBody
    @RequestMapping(value = "/delUser", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户ID删除用户", response = ResponseBean.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", dataType = "String", paramType = "query", required = true),
    })
    public ResponseBean delUser(String userId) {
        if (StrKit.isBlank(userId)) {
            return new ResponseBean(CodeConst.CODE_ERROR_PARAMETER_EMPTY, CodeConst.msgMap.get(CodeConst.CODE_ERROR_PARAMETER_EMPTY));
        }
        Integer integer = userManagementService.delUser(userId);
        if (integer == null) {
            return new ResponseBean(CodeConst.CODE_NO_USER_OR_CUSTOMER, CodeConst.msgMap.get(CodeConst.CODE_NO_USER_OR_CUSTOMER));
        }
        return new ResponseBean();
    }


    /**
     * 系统后台管理-系统用户配置
     *
     * @return
     */
    @RequestMapping(value = "/userManagementPage", method = RequestMethod.GET)
    public String addUser() {
        return "/userManagement/userManagement";
    }
}
