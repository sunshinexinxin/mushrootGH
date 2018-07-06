package com.hyx.apps.sence.dao.impl;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.sence.dao.BackStageManagementDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2017/11/22
 */
@Mapper
public interface BackStageManagementDaoImpl extends BackStageManagementDao {

    /**
     * 系统后台管理-系统用户配置
     * 获取系统用户列表
     *
     * @param params
     * @return
     */
    @Override
    List<User> getUsersList(Map<String, String> params);

   /* *//**
     * 系统后台管理-系统用户配置
     * 添加系统用户
     *
     * @param params
     * @return
     *//*
    @Override
    public Integer addUsers(Map params) {
        logger.info("SQL_ID:BackStageManagement.addUsers");
        int insert = getSqlSession().insert("BackStageManagement.addUsers", params);
        return insert;
    }

    *//**
     * 系统后台管理-系统用户配置
     * 删除系统用户
     *
     * @param userId
     * @return
     *//*
    @Override
    public Integer deleteUsers(String userId) {
        logger.info("SQL_ID:BackStageManagement.deleteUsers");
        System.out.println(userId);
        int delete = getSqlSession().delete("BackStageManagement.deleteUsers", userId);
        return delete;
    }*/
}
