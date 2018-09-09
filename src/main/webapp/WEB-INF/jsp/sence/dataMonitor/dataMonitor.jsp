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
        <h2>一级指数</h2>
        <ul class="clearfix">
            <li style="width: 400px;height:300px;" align="center">
                <div id="myChart1s" style="width: 100%;height:100%;" align="center"></div>
            </li>
            <li class="cen" style="width: 280px;height:300px;" align="center">
                <div style="position:relative;">
                    　　<img src="/static/dataMonitor/images/torange.png" />
                    　　<div style="position:absolute; top:50px;left:120px;">
                        <p>74%</p>
                        </div>
                </div>
            </li>
            <li style="width: 400px;height:300px;" align="center">
                <div id="myChart2s" style="width: 100%;height:100%;" align="center"></div>
            </li>
        </ul>
        <div class="con2-bottom">
            <h2>二级指数</h2>
            <ul class="clearfix">
                <li>
                    <canvas id="dowebok1"></canvas>
                    <div style="position:relative;">
                       <div style="position:absolute; top:-60px;left:60px;">
                        <a>空气温度</a>
                        </div>
                    </div>
                </li>
                <li class="cen">
                    <canvas id="dowebok2"></canvas>
                    <div style="position:relative;">
                        <div style="position:absolute; top:-60px;left:60px;">
                            <a>空气湿度</a>
                        </div>
                    </div>
                </li>
                <li>
                    <canvas id="dowebok3"></canvas>
                    <div style="position:relative;">
                        <div style="position:absolute; top:-60px;left:60px;">
                            <a>土壤温度</a>
                        </div>
                    </div>
                </li>
                <li class="cen">
                    <canvas id="dowebok4"></canvas>
                    <div style="position:relative;">
                        <div style="position:absolute; top:-60px;left:60px;">
                            <a>土壤湿度</a>
                        </div>
                    </div>
                </li>
                <li>
                    <canvas id="dowebok5"></canvas>
                    <div style="position:relative;">
                        <div style="position:absolute; top:-60px;left:60px;">
                            <a>光照强度</a>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>


<script type="text/javascript" src="/static/dataMonitor/js/dataMonitor.js"></script>
</body>
</html>