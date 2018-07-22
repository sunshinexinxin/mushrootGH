package com.hyx.apps.map.service.impl;

import com.hyx.apps.map.bean.Monitor;
import com.hyx.apps.map.dao.MapDao;
import com.hyx.apps.map.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: anke
 * @date: 2018/7/7
 */
@Service
public class MapServiceImpl implements MapService {
    @Autowired
    private MapDao mapDao;

    /**
     * 获取用户对应的基地数据
     *
     * @param userId
     * @param role
     * @return
     */
    @Override
    public List<Monitor> getMapDataByUserId(Map<String, String> params) {
        return mapDao.getMapDataByUserId(params);
    }


    /**
     * 系统管理模块-基地管理-监控状态修改
     *
     * @param params
     * @return
     */
    @Override
    public Integer updateMonitorStatus(Map<String, String> params) {
        return mapDao.updateMonitorStatus(params);
    }
}
