package com.hyx.apps.datareport.dao;

import com.hyx.apps.datareport.bean.ChartsCollectionBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author anke
 * @date 2018/3/25
 */
@Mapper
public interface DataReportDao {
    /**
     * 数据查询模块-饼图折线图-折线图
     *
     * @param pointId
     * @return
     */
    List<ChartsCollectionBean> getTempWetListById(@Param("pointId") String pointId);

    /**
     * 数据查询模块-数据报表
     *
     * @param paramMap
     * @return
     */
    List<ChartsCollectionBean> dataReport(Map paramMap);
}
