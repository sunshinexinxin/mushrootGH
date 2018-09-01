<%--
  Created by IntelliJ IDEA.
  User: anke
  Date: 2018/9/1
  Time: 下午8:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据报表</title>

    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/bootstrap.min.css"/>

    <link rel="stylesheet" type="text/css" href="/static/main/Styles/formui.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/Styles/admin-all.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/Styles/base.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/Styles/ui-lightness/jquery-ui-1.8.22.custom.css"/>

    <script type="text/javascript" src="/static/main/Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="/static/main/Scripts/jquery-ui-1.8.22.custom.min.js"></script>
</head>
<body>
<div>
    <table class="tbform list" id="top_table">
        <div>
            <form class="bs-example bs-example-form" role="form">
                <div class="input-group">
                    <span class="input-group-addon">开始时间:</span>
                    <input type="text" class="form-control" id ="beginDate" placeholder="2017-01-01">
                    &nbsp&nbsp
                    <span class="input-group-addon">结束时间:</span>
                    <input type="text" class="form-control" id ="endDate" placeholder="2018-09-01">
                    &nbsp&nbsp
                    <input type="button" value="查询" class='btn btn-default btn-lg' id="selectReport"/>
                </div>
            </form>
        </div>

        <script src="/static/js/layDate-v5.0.9/laydate/laydate.js"></script> <!-- 改成你的路径 -->
        <script>
            //执行一个laydate实例
            laydate.render({
                elem: '#beginDate' //指定元素
                ,value: '2017-01-01'
            });
            laydate.render({
                elem: '#endDate' //指定元素
            });
        </script>

        <thead>
        <tr class="tr">
            <th colspan="100">数据报表 <i class="tip-up"></i></th>
        </tr>
        </thead>

        <thead>
        <tr>
            <th>序号</th>
            <th>大棚编号</th>
            <th>空气温度</th>
            <th>空气湿度</th>
            <th>土壤温度</th>
            <th>土壤湿度</th>
            <th>光照强度</th>
            <th>二氧化碳浓度</th>
            <th>日期</th>
            <th>时间</th>
        </tr>
        </thead>
    </table>
</div>
<script type="text/javascript" src="/static/js/dataReport/dataReport.js"></script>
</body>
</html>
