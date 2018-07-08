package com.hyx.apps.usermanagement.dao;


import com.hyx.apps.login.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2017/11/22
 */

@Mapper
public interface UserManagementDao {
    /**
     * 系统后台管理-系统用户配置
     * 获取系统用户列表
     *
     * @param params
     * @return
     */
    List<User> getUsersList(Map<String, Object> params);


    /**
     * 系统后台管理-系统用户配置
     * 添加系统用户
     *
     * @param params
     * @return
     */
    Integer addUsers(Map params);

    /**
     * 系统后台管理-系统用户配置
     * 删除系统用户
     *
     * @param userId
     * @return
     */
    Integer delUser(String userId);
}
