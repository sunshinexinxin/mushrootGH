package com.hyx.apps.usermanagement.service;


import com.hyx.apps.login.bean.User;

import java.util.List;

/**
 * @author anke
 * @date 2017/11/22
 */
public interface UserManagementService {

    /**
     * 系统后台管理-系统用户配置
     * 获取系统用户列表
     *
     * @param userId
     * @param status
     * @return
     */
    List<User> getUsersList(String userId, String status);

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
