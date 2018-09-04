<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>预警分析</title>
    <%--<script src="/static/echarts/echarts.min.js"></script>--%>
    <script type="text/javascript" src="/static/dataMonitor/js/echarts.js"></script>
    <link rel="stylesheet" href="/static/dataMonitor/css/reset.css">
    <link rel="stylesheet" href="/static/dataMonitor/css/main.css">
    <script type="text/javascript" src="/static/userInfo/js/jquery-1.8.1.min.js"></script>

    <script type="text/javascript" src="/static/dataMonitor/js/waterbubble.js"></script>
</head>
<body>


<div class="con2 clearfix wrap">
    <div class="con2-top">
        <h2>上层</h2>
        <ul class="clearfix">
            <li>
                <a href="#">
                <div id="myChart1s" style="width: 400px;height:400px;"></div>
                    <%--<div id="myChart1s"><img alt="" src="/static/dataMonitor/images/tyellow.png"/></div>--%>

                    <%--<div id="myChart1s"></div>--%>
                </a>
                <p>1</p>
            </li>
            <li class="cen">
                <a href="###">
                    <div><img alt="" src="/static/dataMonitor/images/torange.png"/></div>
                </a>
                <p>2</p>
            </li>
            <li>
                <a href="###">
                    <div><img alt="" src="/static/dataMonitor/images/tgreen.png"/></div>
                </a>
                <p>3</p>
            </li>
        </ul>
        <div class="con2-bottom">
            <h2>下层</h2>
            <ul class="clearfix">
                <li>
                    <a href="###">
                        <div><canvas id="dowebok1"></canvas></div>
                    </a>
                    <p>空气温度</p>
                </li>
                <li class="cen">
                    <a href="###">
                        <div><canvas id="dowebok2"></canvas></div>
                    </a>
                    <p>空气湿度</p>
                </li>
                <li>
                    <a href="###">
                        <div><canvas id="dowebok3"></canvas></div>
                    </a>
                    <p>土壤温度</p>
                </li>
                <li class="cen">
                    <a href="###">
                        <div><canvas id="dowebok4"></canvas></div>
                    </a>
                    <p>土壤湿度</p>
                </li>
                <li>
                    <a href="###">
                        <div><canvas id="dowebok5"></canvas></div>
                    </a>
                    <p>光照强度</p>
                </li>
            </ul>
        </div>
    </div>
</div>


<script type="text/javascript" src="/static/dataMonitor/js/dataMonitor.js"></script>
</body>
</html>