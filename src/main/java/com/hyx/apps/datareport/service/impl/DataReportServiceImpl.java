package com.hyx.apps.datareport.service.impl;

import com.hyx.apps.datareport.bean.ChartsCollectionBean;
import com.hyx.apps.datareport.dao.DataReportDao;
import com.hyx.apps.datareport.service.DataReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: anke
 * @date: 2018/7/7
 */
@Service
public class DataReportServiceImpl implements DataReportService {
    @Autowired
    private DataReportDao dataReportDao;

    /**
     * 数据查询模块-饼图折线图-折线图
     *
     * @param pointId
     * @return
     */
    @Override
    public List<ChartsCollectionBean> getTempWetListById(String pointId) {
        return dataReportDao.getTempWetListById(pointId);
    }

    /**
     * 数据查询模块-数据报表
     *
     * @param paramMap
     * @return
     */
    @Override
    public List<ChartsCollectionBean> dataReport(Map paramMap) {
        return dataReportDao.dataReport(paramMap);
    }
}
