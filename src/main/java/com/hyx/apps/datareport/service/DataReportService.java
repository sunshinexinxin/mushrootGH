package com.hyx.apps.datareport.service;

import com.hyx.apps.datareport.bean.ChartsCollectionBean;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
public interface DataReportService {


    /**
     * 数据报表统计-温度展示
     *
     * @param pointId
     * @return
     */
    List<ChartsCollectionBean> getTempWetListById(String pointId);
}
