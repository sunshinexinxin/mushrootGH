package com.hyx.apps.map.service;

import com.hyx.apps.map.bean.Monitor;

import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2018/3/25
 */
public interface MapService {

    /**
     * 获取用户对应的基地数据
     *
     * @param params
     * @return
     */
    List<Monitor> getMapDataByUserId(Map<String, String> params);


    /**
     * 系统管理模块-基地管理-监控状态修改
     *
     * @param params
     * @return
     */
    Integer updateMonitorStatus(Map<String, String> params);

}
