package com.hyx.apps.login.dao;

import com.hyx.apps.login.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author anke
 * @date 2018/3/23
 */
@Mapper
public interface UserDao{
    /**
     * 查询数据
     *
     * @return
     */
    User getUserByName(String userName);

}


