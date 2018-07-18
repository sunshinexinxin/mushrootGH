package com.hyx.apps.login.service;

import com.hyx.apps.login.bean.User;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/23
 */

public interface UserService {


    /**
     * 根据用户名获取用户信息
     *
     * @param userName
     * @return
     */
    User getUserByName(String userName);


    /**
     * 根据用户id，获取id和基地的映射
     *
     * @param userId
     * @return
     */
    List<String> getUserPointidMap(String userId);
}
