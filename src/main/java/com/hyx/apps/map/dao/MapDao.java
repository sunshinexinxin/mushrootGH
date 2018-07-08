package com.hyx.apps.map.dao;

import com.hyx.apps.map.bean.Monitor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
@Mapper
public interface MapDao {
    /**
     * 获取用户对应的基地数据
     *
     * @param userId
     * @return
     */
    List<Monitor> getMapDataByUserId(String userId);
}
