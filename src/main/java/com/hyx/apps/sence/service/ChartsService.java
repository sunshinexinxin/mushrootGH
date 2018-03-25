package com.hyx.apps.sence.service;

import com.hyx.apps.sence.bean.ChartsCollectionBean;
import com.hyx.apps.sence.dao.impl.ChartsDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author anke
 * @date 2018/3/25
 */
@Service
public class ChartsService {
    @Autowired
    private ChartsDaoImpl chartsDao;

    /**
     * 数据报表统计-温度展示
     *
     * @param pointId
     * @return
     */
    public List<ChartsCollectionBean> getTempWetListById(String pointId) {
        return chartsDao.getTempWetListById(pointId);
    }
}
