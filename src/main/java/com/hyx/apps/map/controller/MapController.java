package com.hyx.apps.map.controller;

import com.hyx.apps.map.bean.Monitor;
import com.hyx.apps.map.service.MapService;
import com.hyx.common.ResponseBean;
import com.hyx.tools.SecurityUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 地图接口
 * @author: anke
 * @date: 2018/7/7
 */
@Controller
@RequestMapping(value = "/mushRoomGH")
@Api(description = "地图信息Controller")
public class MapController {
    protected final Logger logger = Logger.getLogger(MapController.class);

    @Autowired
    private MapService mapService;


    /**
     * 展示地图数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/mushRoomMapData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "获取地图数据", response = ResponseBean.class)
    public ResponseBean mushRoomMapData() {
        logger.info("获取地图数据");
        String userId = SecurityUtil.getCurrentUser().getUserId();
        String role = SecurityUtil.getCurrentUser().getRole();
        Map params = new HashMap(16);
        params.put("userId", userId);
        params.put("role", role);
        params.put("mushroomStatus", "1");
        List<Monitor> mushRoomList = mapService.getMapDataByUserId(params);
        List resuList = new ArrayList();
        for (int i = 0; i < mushRoomList.size(); i++) {
            List resuLists = new ArrayList();
            resuLists.add("\"" + mushRoomList.get(i).getMushroomLat() + "\"");
            resuLists.add("\"" + mushRoomList.get(i).getMushroomLong() + "\"");
            resuLists.add("\"" + mushRoomList.get(i).getMushroomName() + "\"");
            resuList.add(resuLists);
        }
        return new ResponseBean(resuList.toString());
    }


    /**
     * 地图首页
     *
     * @return
     */
    @RequestMapping(value = "/mushRoomMapPage", method = RequestMethod.GET)
    public String mapPage() {
        return "/sence/mushRoomMap";
    }
}
