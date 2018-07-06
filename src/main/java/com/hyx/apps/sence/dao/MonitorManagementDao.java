package com.hyx.apps.sence.dao;

import com.hyx.apps.sence.bean.MonitorManagement;

import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2018/4/19
 */
public interface MonitorManagementDao {
    /**
     * 获取用户对应的视频截图
     *
     * @param userId
     * @return
     */
    List<MonitorManagement> getImagesById(String userId);

    /**
     * 存储视频截图数据
     *
     * @param map
     * @return
     */
    Integer storeImage(Map<String, String> map);
}
