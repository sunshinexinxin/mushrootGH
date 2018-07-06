package com.hyx.apps.sence.service;


import com.hyx.apps.login.bean.User;
import com.hyx.apps.sence.dao.BackStageManagementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2017/11/22
 */
@Service
public class BackStageManagementService {
    @Autowired
    private BackStageManagementDao backStageManagementDao;

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
        return backStageManagementDao.getUsersList(params);
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
