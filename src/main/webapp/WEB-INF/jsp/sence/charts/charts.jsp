<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/echarts/echarts.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/admin-all.css"/>
    <script type="text/javascript" src="/static/userInfo/js/jquery-1.8.1.min.js"></script>
    <script type="text/javascript" src="/static/userInfo/js/bui-min.js"></script>
    <script type="text/javascript" src="/static/userInfo/js/config-min.js"></script>
    <script type="text/javascript" src="/static/js/sence/charts/charts.js"></script>

    <%--<script type="text/javascript" src="/static/main/Scripts/jquery-1.7.2.js"></script>--%>
    <%--<script type="text/javascript" src="/static/main/Scripts/jquery-ui-1.8.22.custom.min.js"></script>--%>

    <%--<script type="text/javascript" src="/static/js/sence/charts/echarts_bingtu.js"></script>--%>
    <%--<script type="text/javascript" src="/static/js/sence/charts/foldLineDiagram.js"></script>--%>
</head>
<body>

<div class="alert alert-info">首页<b class="tip"></b>数据查询模块<b class="tip"></b>饼图折线图</div>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="tabbable" id="tabs-55350">
                <ul class="nav nav-tabs">
                    <li class="active" id="id1">
                        <%--<a href="#panel-849551" data-toggle="tab" id="hrefFoldLineDiagram">折线分析</a>--%>
                        <a href="#" data-toggle="tab" id="hrefFoldLineDiagram" onclick="foldLineDiagram()"><p>折线分析</p></a>
                    </li>
                    <li id="id2">
                        <a href="#" data-toggle="tab" id="hrefPieChart" onclick="pieChart()"><p>饼图分析</p></a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane" id="panel-849551">
                        <div id="foldLineDiagram" style="width: 900px;height:400px;"></div>
                    </div>
                    <div class="tab-pane" id="panel-652223">
                        <%--<div id="pieChart" style="width: 900px;height:400px;"></div>--%>
                        <div id="pieChart" style="width: 800px;height:600px;"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
