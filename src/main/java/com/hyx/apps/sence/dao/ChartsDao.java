package com.hyx.apps.sence.dao;

import com.hyx.apps.sence.bean.ChartsCollectionBean;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
public interface ChartsDao {
    /**
     * 数据报表统计-温度展示
     *
     * @param pointId
     * @return
     */
    List<ChartsCollectionBean> getTempWetListById(String pointId);
}
