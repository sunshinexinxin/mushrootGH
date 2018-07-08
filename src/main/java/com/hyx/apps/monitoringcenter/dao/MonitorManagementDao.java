package com.hyx.apps.monitoringcenter.dao;

import com.hyx.apps.monitoringcenter.bean.MonitoringCenter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2018/4/19
 */
@Mapper
public interface MonitorManagementDao {
    /**
     * 获取用户对应的视频截图
     *
     * @param userId
     * @return
     */
    List<MonitoringCenter> getImagesById(String userId);

    /**
     * 存储视频截图数据
     *
     * @param map
     * @return
     */
    Integer storeImage(Map<String, String> map);
}
