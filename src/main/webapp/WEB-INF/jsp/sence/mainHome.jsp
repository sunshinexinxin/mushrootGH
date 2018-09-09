<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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

        <%--天气插件--%>
            <div id="tp-weather-widget" align="center"></div>
            <script>(function(T,h,i,n,k,P,a,g,e){g=function(){P=h.createElement(i);a=h.getElementsByTagName(i)[0];P.src=k;P.charset="utf-8";P.async=1;a.parentNode.insertBefore(P,a)};T["ThinkPageWeatherWidgetObject"]=n;T[n]||(T[n]=function(){(T[n].q=T[n].q||[]).push(arguments)});T[n].l=+new Date();if(T.attachEvent){T.attachEvent("onload",g)}else{T.addEventListener("load",g,false)}}(window,document,"script","tpwidget","//widget.seniverse.com/widget/chameleon.js"))</script>
            <script>tpwidget("init", {
                "flavor": "slim",
                "location": "WWCJN0RMDUFV",
                "geolocation": "disabled",
                "language": "zh-chs",
                "unit": "c",
                "theme": "chameleon",
                "container": "tp-weather-widget",
                "bubble": "enabled",
                "alarmType": "badge",
                "color": "#FFFFFF",
                "uid": "UCDB687F69",
                "hash": "7a2153e63fc40c284eddabf4e80f18b0"
            });
            tpwidget("show");</script>

        <div class="top-menu">
            <ul class="top-menu-nav">
                <li>
                    <a target="Conframe" href="/mushRoomGH/mushRoomMapPage" id="homePage" name="homePage">
                        <p>首页</p>
                    </a>
                </li>




            </ul>
        </div>
        <div class="top-nav">
            欢迎您，${userName}！&nbsp;&nbsp;
            <a href="/mushRoomGH/userInfoPage" target="Conframe">个人中心</a> |
            <a href="/mushRoomGH/logout">安全退出</a>
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
                <a class="one" id="left1"><span id="span1">数据查询</span></a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b>
                        <a target="Conframe" href="/mushRoomGH/dataReportPage">历史数据查询</a>
                    </li>
                    <li>
                        <b class="tip"></b>
                        <a target="Conframe" href="/mushRoomGH/chartsPage">数据可视化</a>
                    </li>
                    <li>
                        <b class="tip"></b>
                        <a target="Conframe" href="/mushRoomGH/realTimeCameraPage">实时视频数据</a>
                    </li>
                    <li>
                        <b class="tip"></b>
                        <a target="Conframe" href="/mushRoomGH/seeHistorImagesPage">历史视频数据</a>
                    </li>

                </ul>
            </div>
            <div>
                <a class="one" id="left2">预警分析</a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b><a target="Conframe" href="/mushRoomGH/dataMonitorPage">数据监测</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe" href="/static/main/Template/form-guide.html">实施报警</a>
                    </li>
                </ul>
            </div>
            <div>
                <a class="one" id="left3">行业资讯</a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b><a target="Conframe" href="/static/mushRootNews/mrhistory.html">食用菌文化</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe" href="/static/mushRootNews/mushRooMtech.html">食用菌培植技术</a>
                    </li>
                    <li>
                        <%--<b class="tip"></b><a target="Conframe" href="http://www.hebsyj.com/zixunzhongxin/">食用菌行业新闻</a>--%>
                        <b class="tip"></b><a target="Conframe" href="/static/mushRootNews/zixun.html">食用菌行业新闻</a>
                        <%--<b class="tip"></b><a target="Conframe" href="/static/industryInformation/industryInfomation.html">食用菌行业新闻</a>--%>
                    </li>
                </ul>
            </div>
            <div>
                <a class="one" id="left4">基地管理</a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b><a target="Conframe" href="/mushRoomGH/baseManagePage">基地管理</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe" href="/static/main/Template/formstyle.html">大棚管理</a>
                    </li>

                </ul>
            </div>
            <div>
                <input type="hidden" id="role" value="${userBean.getRole()}">
            </div>
            <div>
                <a class="one" id="left5">系统管理</a>
                <ul class="kid">
                    <li>
                        <b class="tip"></b><a target="Conframe" href="/mushRoomGH/userManagePage">用户管理</a>
                    </li>
                    <li>
                        <b class="tip"></b><a target="Conframe" href="/mushRoomGH/deviceManagePage">设备管理</a>
                    </li>
                    <%--<li>--%>
                        <%--<b class="tip"></b><a target="Conframe"--%>
                                              <%--href="/mushRoomGH/logManagePage">日志管理</a>--%>
                    <%--</li>--%>
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

<script type="text/javascript" src="/static/js/sence/mainHome.js"></script>

</body>
</html>
