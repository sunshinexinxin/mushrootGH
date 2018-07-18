package com.hyx.apps.map.service.impl;

import com.hyx.apps.map.bean.Monitor;
import com.hyx.apps.map.dao.MapDao;
import com.hyx.apps.map.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
     * @param status
     * @return
     */
    @Override
    public List<Monitor> getMapDataByUserId(String userId, String status) {
        return mapDao.getMapDataByUserId(userId, status);
    }
}
