package com.hyx.apps.sence.service;

import com.hyx.apps.sence.bean.Monitor;
import com.hyx.apps.sence.dao.impl.MapDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
@Service
public class MapService {
    @Autowired
    private MapDaoImpl mapDao;

    /**
     * 获取用户对应的基地数据
     *
     * @param userId
     * @return
     */
    public List<Monitor> getMapDataByUserId(String userId) {
        return mapDao.getMapDataByUserId(userId);
    }

}
