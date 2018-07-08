package com.hyx.apps.datareport.controller;

import com.hyx.apps.datareport.bean.ChartsCollectionBean;
import com.hyx.apps.datareport.service.DataReportService;
import com.hyx.common.ResponseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:实时数据查询
 * @author: anke
 * @date: 2018/7/7
 */
@Controller
@RequestMapping("/mushRoomGH")
@Api(description = "数据报表统计Controller")
public class DataReportController {
    protected final Logger logger = Logger.getLogger(DataReportController.class);

    @Autowired
    private DataReportService dataReportService;

    /**
     * 数据报表统计-温度展示
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/echarts_temp_wetData", method = RequestMethod.GET)
    @ApiOperation(value = "温度展示", response = ResponseBean.class)
    public ResponseBean tempWetData() {
        logger.info("数据报表统计-温度展示");
        //TODO 该方法的逻辑还有问题，js页面需要修改
        //TODO 该出需要修改成获取值
        List<ChartsCollectionBean> tempWetList = dataReportService.getTempWetListById("00011");
        return new ResponseBean(tempWetList);
    }


    /**
     * 数据报表统计-饼图展示
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/echarts_bingtu", method = RequestMethod.GET)
    @ApiOperation(value = "饼图展示", response = String.class)
    public String bingtu(HttpServletRequest request) {
        String lat = request.getParameter("lat");
        String lng = request.getParameter("lng");
        return "sence/charts/echarts_bingtu";
    }

    /**
     * 数据报表统计-温度折线图展示
     *
     * @return
     */
    @RequestMapping(value = "/echarts_temp_wetPage", method = RequestMethod.GET)
    @ApiOperation(value = "温度折线图展示", response = String.class)
    public String tempWetPage() {
        return "/sence/charts/echarts_temp_wet";
    }
}
