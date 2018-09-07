package com.hyx.apps.datareport.controller;

import com.hyx.apps.datareport.bean.ChartsCollectionBean;
import com.hyx.apps.datareport.service.DataReportService;
import com.hyx.apps.login.bean.User;
import com.hyx.common.ResponseBean;
import com.hyx.tools.SecurityUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:实时数据查询
 * @author: anke
 * @date: 2018/7/7
 */
@Controller
@RequestMapping("/mushRoomGH")
@Api(description = "数据查询模块Controller")
public class DataReportController {
    protected final Logger logger = Logger.getLogger(DataReportController.class);

    @Autowired
    private DataReportService dataReportService;

    /**
     * 数据查询模块-饼图折线图-折线图
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/foldLineDiagram", method = RequestMethod.GET)
    @ApiOperation(value = "温度展示", response = ResponseBean.class)
    public ResponseBean foldLineDiagram() {
        logger.info("数据报表统计-温度展示");
        //TODO 该方法的逻辑还有问题，js页面需要修改
        List<User> userPointidMap = (List<User>) SecurityUtil.getCurrentUser("userPointidMap");
        logger.info(userPointidMap);
        List<ChartsCollectionBean> tempWetList = dataReportService.getTempWetListById("00011");
        return new ResponseBean(tempWetList);
    }


    /**
     * 数据查询模块-饼图折线图-饼图
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/pieChart", method = RequestMethod.GET)
    @ApiOperation(value = "饼图展示", response = String.class)
    public ResponseBean bingtu(HttpServletRequest request) {
        String lat = request.getParameter("lat");
        String lng = request.getParameter("lng");
        return new ResponseBean();
    }

    /**
     * 数据查询模块-数据报表
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/dataReport", method = RequestMethod.GET)
    @ApiOperation(value = "数据报表", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pointId", value = "基地ID", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "beginDate", value = "开始时间", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "endDate", value = "结束时间", dataType = "String", paramType = "query", required = true)
    })
    public ResponseBean dataReport(String pointId, String beginDate, String endDate, HttpServletRequest request) {
        Map<String, String> params = new HashMap<>(16);
        params.put("pointId", pointId);
        String beginDates = beginDate.replaceAll("-", "");
        String endDates = endDate.replaceAll("-", "");
        params.put("beginDate", beginDates + "000000");
        params.put("endDate", endDates + "235959");
        List<ChartsCollectionBean> chartsCollectionBeans = dataReportService.dataReport(params);
        return new ResponseBean(chartsCollectionBeans);
    }

    /**
     * 数据查询模块-饼图折线图
     *
     * @return
     */
    @RequestMapping(value = "/chartsPage", method = RequestMethod.GET)
    @ApiOperation(value = "温度折线图展示", response = String.class)
    public String chartsPage() {
        return "/sence/charts/charts";
    }


    /**
     * 数据查询模块-数据报表
     *
     * @return
     */
    @RequestMapping(value = "/dataReportPage", method = RequestMethod.GET)
    @ApiOperation(value = "数据报表", response = String.class)
    public String dataReportPage() {
        return "/dataReport/dataReport";
    }
}
