package com.hyx.apps.datamonitor.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description:预警分析
 * @author: anke
 * @date: 2018/7/7
 */
@Controller
@RequestMapping("/mushRoomGH")
@Api(description = "预警分析Controller")
public class DataMonitorController {
    protected final Logger logger = Logger.getLogger(DataMonitorController.class);


    /**
     * 预警分析-数据监测
     *
     * @return
     */
    @RequestMapping(value = "/dataMonitorPage", method = RequestMethod.GET)
    @ApiOperation(value = "数据报表", response = String.class)
    public String dataReportPage() {
        return "/sence/dataMonitor/dataMonitor";
    }
}
