package com.hyx.apps.systemmanage.controller;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.login.service.UserService;
import com.hyx.apps.map.bean.Monitor;
import com.hyx.apps.map.service.MapService;
import com.hyx.apps.systemmanage.service.SystemManageService;
import com.hyx.common.CodeConst;
import com.hyx.common.ResponseBean;
import com.hyx.tools.CommonUtil;
import com.hyx.tools.Md5Utils;
import com.hyx.tools.SecurityUtil;
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
@Api(value = "SystemManageController", description = "系统管理模块控制层")
public class SystemManageController {
    protected final Logger logger = Logger.getLogger(SystemManageController.class);


    @Autowired
    private SystemManageService systemManageService;
    @Autowired
    private UserService userService;
    @Autowired
    private MapService mapService;

    @ResponseBody
    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    @ApiOperation(value = "系统用户配置", response = ResponseBean.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "role", value = "用户状态", dataType = "String", paramType = "query", required = true),
    })
    public ResponseBean getUsers(String role) {
        if (StrKit.isBlank(role)) {
            return new ResponseBean(CodeConst.CODE_ERROR_PARAMETER_EMPTY, CodeConst.msgMap.get(CodeConst.CODE_ERROR_PARAMETER_EMPTY));
        }
        Map<String, Object> params = new HashMap<>(16);
        params.put("role", role);
        List<User> usersList = systemManageService.getUsersList(params);
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
            @ApiImplicitParam(name = "role", value = "用户角色", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "memo", value = "备注", dataType = "String", paramType = "query"),
    })
    public ResponseBean addUsers(String userName, String userPsd, String userAge, String userPhone, String userAdd, String role, String memo) {
        if (StrKit.isBlank(userName)) {
            return new ResponseBean(CodeConst.CODE_ERROR_PARAMETER_EMPTY, CodeConst.msgMap.get(CodeConst.CODE_ERROR_PARAMETER_EMPTY));
        }
        Map<String, Object> params = new HashMap<>(16);
        params.put("userName", userName);
        params.put("userPsd", Md5Utils.MD5Encode(userPsd));
        params.put("userAge", userAge);
        params.put("userPhone", userPhone);
        params.put("userAdd", userAdd);
        params.put("role", role);
        params.put("memo", memo);
        params.put("ctime", CommonUtil.getLocalSysTime2());
        logger.info(params);
        int integer = systemManageService.addUsers(params);
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
        Integer integer = systemManageService.delUser(userId);
        if (integer == null) {
            return new ResponseBean(CodeConst.CODE_NO_USER_OR_CUSTOMER, CodeConst.msgMap.get(CodeConst.CODE_NO_USER_OR_CUSTOMER));
        }
        return new ResponseBean();
    }

    /**
     * 系统管理模块-基地管理
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/baseManage", method = RequestMethod.GET)
    @ApiOperation(value = "系统管理模块-基地管理", response = ResponseBean.class)
    public ResponseBean baseManage() {
        logger.info("系统管理模块-基地管理");
        //获取用户id及用户角色
        String userId = SecurityUtil.getCurrentUser().getUserId();
        String role = SecurityUtil.getCurrentUser().getRole();
        if (StrKit.isBlank(userId)) {
            return new ResponseBean();
        }
        Map params = new HashMap(16);
        params.put("userId", userId);
        params.put("role", role);
        try {
            List<Monitor> userInfoList = mapService.getMapDataByUserId(params);
            logger.info("userInfoList:" + userInfoList);
            return new ResponseBean(userInfoList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseBean();
    }

    /**
     * 系统管理模块-基地管理-监控状态修改
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateMonitorStatus", method = RequestMethod.GET)
    @ApiOperation(value = "系统管理模块-基地管理-监控状态修改", response = ResponseBean.class)
    public ResponseBean updateMonitorStatus(String pointid, String status) {
        logger.info("系统管理模块-基地管理-监控状态修改");
        if (StrKit.isBlank(pointid) || StrKit.isBlank(status)) {
            return new ResponseBean();
        }
        Map params = new HashMap(16);
        params.put("mushroomPointid", pointid);
        if ("0".equals(status)) {
            params.put("mushroomStatus", "1");
        } else if ("1".equals(status)) {
            params.put("mushroomStatus", "0");
        }
        try {
            Integer cnt = mapService.updateMonitorStatus(params);
            if (cnt == 1) {
                return new ResponseBean();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseBean();
    }

    /**
     * 系统管理模块-基地管理-用户管理的基地
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/usersMushroom", method = RequestMethod.GET)
    @ApiOperation(value = "系统管理模块-基地管理-用户管理的基地", response = ResponseBean.class)
    public ResponseBean usersMushroom(String userId) {
        logger.info("系统管理模块-基地管理-用户管理的基地");
        if (StrKit.isBlank(userId)) {
            return new ResponseBean();
        }
        Map params = new HashMap(16);
        params.put("userId", userId);
        params.put("isPerson", "1");
        List list = mapService.usersMushroom(params);
        if (list.size() != 0) {
            return new ResponseBean(list);
        }
        return new ResponseBean();
    }


    /**
     * 系统管理模块-用户管理
     *
     * @return
     */
    @RequestMapping(value = "/userManagePage", method = RequestMethod.GET)
    public String userManagePage() {
        return "/systemManage/userManage";
    }

    /**
     * 系统管理模块-基地管理
     *
     * @return
     */
    @RequestMapping(value = "/baseManagePage", method = RequestMethod.GET)
    public String baseManagePage() {
        return "/systemManage/baseManage";
    }

    /**
     * 系统管理模块-日志管理
     *
     * @return
     */
    @RequestMapping(value = "/logManagePage", method = RequestMethod.GET)
    public String logManagePage() {
        return "/systemManage/logManage";
    }

    /**
     * 系统管理模块-设备管理
     *
     * @return
     */
    @RequestMapping(value = "/deviceManagePage", method = RequestMethod.GET)
    public String deviceManagePage() {
        return "/systemManage/deviceManage";
    }


    /**
     * 系统管理模块-大棚管理
     *
     * @return
     */
    @RequestMapping(value = "/houseManagePage", method = RequestMethod.GET)
    public String houseManagePage() {
        return "/systemManage/houseManage";
    }
}
