package com.hyx.apps.datareport.service.impl;

import com.hyx.apps.datareport.dao.DataReportDao;
import com.hyx.apps.datareport.service.DataReportService;
import com.hyx.apps.datareport.bean.ChartsCollectionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
