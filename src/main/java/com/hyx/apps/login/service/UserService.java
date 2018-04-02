package com.hyx.apps.login.service;

import com.hyx.apps.login.bean.User;
import com.hyx.apps.login.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author anke
 * @date 2018/3/23
 */
@Service
public class UserService {
    /**
     *
     */
    @Autowired
    private UserDaoImpl userdao;

    public User getUserByName(String userName) {
        return userdao.getUserByName(userName);
    }


}
