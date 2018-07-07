package com.hyx.apps.map.service.impl;

import com.hyx.apps.map.service.MapService;
import com.hyx.apps.sence.bean.Monitor;
import com.hyx.apps.map.dao.MapDaoImpl;
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
    private MapDaoImpl mapDao;

    @Override
    public List<Monitor> getMapDataByUserId(String userId) {
        return mapDao.getMapDataByUserId(userId);
    }
}
