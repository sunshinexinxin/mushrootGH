package com.hyx.apps.map.dao;

import com.hyx.apps.map.bean.Monitor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
     * @param status
     * @return
     */
    List<Monitor> getMapDataByUserId(@Param("userId") String userId,
                                     @Param("status") String status
    );


}
