package com.hyx.apps.login.service.impl;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.login.dao.UserDao;
import com.hyx.apps.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author anke
 * @date 2018/7/7
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userdao;

    /**
     * 根据用户名获取用户信息
     *
     * @param userName
     * @return
     */
    @Override
    public User getUserByName(String userName) {
        return userdao.getUserByName(userName);
    }


    /**
     * 根据用户id，获取id和基地的映射
     *
     * @param userId
     * @return
     */
    @Override
    public List<String> getUserPointidMap(String userId) {
        return userdao.getUserPointidMap(userId);
    }
}
