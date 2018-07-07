package com.hyx.apps.login.service;

import com.hyx.apps.login.bean.User;

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


}
