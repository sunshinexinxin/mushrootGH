package com.hyx.apps.usermanagement.service.impl;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.login.dao.UserDao;
import com.hyx.apps.usermanagement.dao.UserManagementDao;
import com.hyx.apps.usermanagement.service.UserManagementService;
import com.hyx.common.CodeConst;
import com.hyx.tools.StrKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    private UserDao userDao;

    /**
     * 系统后台管理-系统用户配置
     * 获取系统用户列表
     *
     * @param params
     * @return
     */
    @Override
    public List<User> getUsersList(Map<String, Object> params) {
        return userManagementDao.getUsersList(params);
    }

    /**
     * 系统后台管理-系统用户配置
     * 添加系统用户
     *
     * @param params
     * @return
     */
    @Override
    public int addUsers(Map<String, Object> params) {
        User user = userDao.getUserByName(String.valueOf(params.get("userName")));
        if (user == null || StrKit.isBlank(user.getUserName())) {
            return userManagementDao.addUsers(params);
        } else {
            return Integer.parseInt(CodeConst.CODE_HAD_USER_OR_CUSTOMER);
        }
    }

    /**
     * 系统后台管理-系统用户配置
     * 删除系统用户
     *
     * @param userID
     * @return
     */
    @Override
    public Integer delUser(String userID) {
        return userManagementDao.delUser(userID);
    }
}
