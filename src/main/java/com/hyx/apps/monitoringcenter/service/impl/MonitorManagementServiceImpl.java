package com.hyx.apps.monitoringcenter.service.impl;

import com.hyx.apps.monitoringcenter.dao.MonitorManagementDao;
import com.hyx.apps.monitoringcenter.service.MonitorManagementService;
import com.hyx.apps.monitoringcenter.bean.MonitoringCenter;
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
public class MonitorManagementServiceImpl implements MonitorManagementService {
    @Autowired
    MonitorManagementDao monitorManagementDao;


    /**
     * 获取用户对应的视频截图
     */


    public List<MonitoringCenter> getImagesById(String userId) {
        return monitorManagementDao.getImagesById(userId);
    }

    public Integer storeImage(Map<String, String> map) {
        return monitorManagementDao.storeImage(map);
    }
}
