package com.hyx.apps.datareport.controller;

import com.hyx.apps.datareport.bean.ChartsCollectionBean;
import com.hyx.apps.datareport.service.DataReportService;
import com.hyx.apps.login.bean.User;
import com.hyx.common.ResponseBean;
import com.hyx.tools.SecurityUtil;
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
    public ResponseBean tempWetData() {
        logger.info("数据报表统计-温度展示");
        //TODO 该方法的逻辑还有问题，js页面需要修改
        List<User> userPointidMap = (List<User>) SecurityUtil.getCurrentUser("userPointidMap");
        logger.info(userPointidMap);
        List<ChartsCollectionBean> tempWetList = dataReportService.getTempWetListById("21006");
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
     * 数据查询模块-饼图折线图
     *
     * @return
     */
    @RequestMapping(value = "/chartsPage", method = RequestMethod.GET)
    @ApiOperation(value = "温度折线图展示", response = String.class)
    public String chartsPage() {
        return "/sence/charts/charts";
    }
}
