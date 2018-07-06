﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>蘑菇大棚监控系统</title>
    <link rel="shortcut icon" href="/static/image/favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="/static/main/Styles/admin-all.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/Styles/base.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/Styles/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/Styles/ui-lightness/jquery-ui-1.8.22.custom.css"/>

    <script type="text/javascript" src="/static/main/Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="/static/main/Scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <script type="text/javascript" src="/static/main/Scripts/index.js"></script>
    <script type="text/javascript" src="/static/js/sence/mainHome.js"></script>

</head>
<body>

<div class="warp">
    <!--头部开始-->
    <div class="top_c">
        <div class="top-menu">
            <ul class="top-menu-nav">
                <li>
                    <a target="Conframe" href="/mushRoomGH/mushRoomMapPage" id="homePage" name="homePage">
                        <p>首页</p>
                    </a>
                </li>
                <li>
                    <a href="#">信息发布<i class="tip-up"></i>
                    </a>
                    <ul class="kidc">
                        <li>
                            <a target="Conframe"
                               href="/static/main/Template/find-order.html">预留菜单</a>
                        </li>
                        <li>
                            <a target="Conframe"
                               href="/static/main/Template/find-1.html">预留菜单</a>
                        </li>
                        <li>
                            <a target="Conframe"
                               href="/static/main/Template/find-2.html">预留菜单</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#">监控中心<i class="tip-up"></i>
                    </a>
                    <ul class="kidc">
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/mushRoomGH/realTimeCameraPage">实时视频数据</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/mushRoomGH/seeHistorImages">历史视频数据</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#">系统管理<i class="tip-up"></i>
                    </a>
                    <ul class="kidc">
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/TemplatmushroomGreenHouseGraduateDesignaster-slave.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/form-collapse.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/form-tabs.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/form-tree.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/form-guide.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/form-tabs-list.html">预留菜单</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#">关于<i class="tip-up"></i>
                    </a>
                    <ul class="kidc">
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/Alert.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/Alert.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/Alert.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/Alert.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/Alert.html">预留菜单</a>
                        </li>
                        <li>
                            <b class="tip"></b><a target="Conframe"
                                                  href="/static/main/Template/Alert.html">预留菜单</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="top-nav">
            欢迎您，${userName}！&nbsp;&nbsp;
            <a href="/mushRoomGH/userInfoPage" target="Conframe">个人中心</a> |
            <a href="/mushRoomGH/login">安全退出</a>
        </div>
    </div>
    <!--头部结束-->
    <!--左边菜单开始-->

    <div class="left_c left">
        <h1>
            系统操作菜单
        </h1>
        <div class="acc">
            <div>
                <a class="one" id="left1"><span id="span1">数据报表统计</span></a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b>
                        <a target="Conframe"
                           href="/mushRoomGH/echarts_bingtu">饼图统计</a>
                    </li>
                    <li>
                        <b class="tip"></b>
                        <a target="Conframe"
                           href="/static/main/Template/echarts_duiji.jsp">统计分析</a>
                    </li>
                    <li>
                        <b class="tip"></b>
                        <a target="Conframe" href="/mushRoomGH/echarts_temp_wetPage">温度展示</a>
                    </li>
                </ul>
            </div>
            <div>
                <a class="one" id="left2">实时数据查询</a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/mushRoomGH/form-collapse">空气温度</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/form-guide.html">土壤湿度</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/Maintain-del.html">光照强度</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/Maintain-del.html">二氧化碳含量</a>
                    </li>
                </ul>
            </div>
            <div>
                <a class="one" id="left3">预警规则管理</a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/Alert.html">预警规则制定</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/Alert.html">责任人指定</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/Alert.html">预留菜单</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/Alert.html">预留菜单</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/Alert.html">预留菜单</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/Alert.html">预留菜单</a>
                    </li>
                </ul>
            </div>
            <div>
                <a class="one" id="left4">远程设备管理</a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/order.html">修改设备编号</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/formstyle.html">修改设备名称</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/formstyle.html">预留菜单</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/formstyle.html">预留菜单</a>
                    </li>
                </ul>
            </div>
            <div>
                <input type="hidden" id="status" value="${userBean.getStatus()}">
            </div>
            <div>
                <a class="one" id="left5">系统后台管理</a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/mushRoomGH/addUserPage">系统用户配置</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/formstyle.html">修改个人信息</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe"
                                              href="/static/main/Template/formstyle.html">预留菜单</a>
                    </li>
                </ul>
            </div>
            <div id="datepicker"></div>
        </div>

    </div>
    <!--左边菜单结束-->
    <!--右边框架开始-->

    <div class="right_c">

        <div class="nav-tip" onclick="void(0)">
            &nbsp;
        </div>

    </div>
    <div class="Conframe">
        <iframe name="Conframe" id="Conframe" src=""></iframe>
    </div>

    <!--右边框架结束-->
    <!--底部开始-->
    <div class="bottom_c">
        Copyright &copy;2017 韩奕昕 毕业设计专用
    </div>
    <!--底部结束-->
</div>

<script type="text/javascript" src="/static/js/sence/charts/mainHome.js"></script>

</body>
</html>
