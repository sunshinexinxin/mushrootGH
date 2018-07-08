package com.hyx.apps.datareport.dao;

import com.hyx.apps.datareport.bean.ChartsCollectionBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
@Mapper
public interface DataReportDao {
    /**
     * 数据报表统计-温度展示
     *
     * @param pointId
     * @return
     */
    List<ChartsCollectionBean> getTempWetListById(String pointId);
}
