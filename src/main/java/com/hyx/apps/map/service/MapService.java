package com.hyx.apps.map.service;

import com.hyx.apps.sence.bean.Monitor;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
public interface MapService {

    /**
     * 获取用户对应的基地数据
     *
     * @param userId
     * @return
     */
    List<Monitor> getMapDataByUserId(String userId);

}
