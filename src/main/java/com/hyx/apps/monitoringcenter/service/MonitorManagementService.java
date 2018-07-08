package com.hyx.apps.monitoringcenter.service;

import com.hyx.apps.monitoringcenter.bean.MonitoringCenter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2018/4/19
 */
@Service
public interface MonitorManagementService {
    /**
     * 获取用户对应的视频截图
     */


    List<MonitoringCenter> getImagesById(String userId);

    Integer storeImage(Map<String, String> map);
}
