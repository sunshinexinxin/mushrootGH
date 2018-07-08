package com.hyx.apps.usermanagement.service.impl;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.usermanagement.dao.UserManagementDao;
import com.hyx.apps.usermanagement.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: anke
 * @date: 2018/7/8
 */
@Service
public class UserManagementServiceImpl implements UserManagementService {
    @Autowired
    private UserManagementDao userManagementDao;

    /**
     * 系统后台管理-系统用户配置
     * 获取系统用户列表
     *
     * @param userId
     * @param status
     * @return
     */
    public List<User> getUsersList(String userId, String status) {
        Map<String, String> params = new HashMap<>(16);
        params.put("userId", userId);
        params.put("status", status);
        return userManagementDao.getUsersList(params);
    }

    /**
     * 系统后台管理-系统用户配置
     * 添加系统用户
     *
     * @param params
     * @return
     */
//    Integer addUsers(Map params);

    /**
     * 系统后台管理-系统用户配置
     * 删除系统用户
     *
     * @param userID
     * @return
     */
//    Integer deleteUsers(String userID);
}
