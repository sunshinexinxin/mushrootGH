package com.hyx.apps.sence.service;

import com.hyx.apps.sence.bean.MonitorManagement;
import com.hyx.apps.sence.dao.impl.MonitorManagementDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2018/4/19
 */
@Service
public class MonitorManagementService {
    /**
     * 获取用户对应的视频截图
     */
    @Autowired
    MonitorManagementDaoImpl monitorManagementDao;

    public List<MonitorManagement> getImagesById(String userId) {
        return monitorManagementDao.getImagesById(userId);
    }

    public Integer storeImage(Map<String, String> map) {
        return monitorManagementDao.storeImage(map);
    }
}
