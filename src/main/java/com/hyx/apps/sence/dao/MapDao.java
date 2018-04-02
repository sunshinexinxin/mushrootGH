package com.hyx.apps.sence.dao;

import com.hyx.apps.sence.bean.Monitor;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
public interface MapDao {
    /**
     * 获取用户对应的基地数据
     *
     * @param userId
     * @return
     */
    List<Monitor> getMapDataByUserId(String userId);
}
