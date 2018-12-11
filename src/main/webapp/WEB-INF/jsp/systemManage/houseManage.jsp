<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>大棚管理</title>

    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/admin-all.css"/>
    <link rel="shortcut icon" href="/static/image/favicon.ico"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="/static/css/com/dpl-min.css" rel="stylesheet" type="text/css"/>
    <link href="/static/css/com/bui-min.css" rel="stylesheet" type="text/css"/>
    <link href="/static/css/com/page-min.css" rel="stylesheet" type="text/css"/>
    <!-- 下面的样式，仅是为了显示代码，而不应该在项目中使用-->
    <link href="/static/css/com/prettify.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="alert alert-info">
    当前位置
    <b class="tip"></b>
    <a href="/mushRoomMapPage">首页</a>
    <b class="tip"></b>
    基地管理
    <b class="tip"></b>
    大棚管理
</div>
<div class="detail-section">

    <h2>
        大棚列表
        <br/>
    </h2>

    <div>
        <table class="table table-bordered table-hover" id="table">
            <thead>
            <tr bgcolor=#C1CDCD>
                <th>大棚编号</th>
                <th>大棚名称</th>
                <th>所属基地编号</th>
                <th>大棚负责人ID</th>
                <th>联系方式</th>
                <th>大棚状态</th>
                <th>创建时间</th>
            </tr>
            </thead>
            <tr>
                <td>2</td>
                <td>2号大棚</td>
                <td>21002</td>
                <td>李四</td>
                <td>13158796214</td>
                <td>非监控</td>
                <td>2018-09-09 16:56:20</td>
            </tr>
            <tr>
                <td>1</td>
                <td>1号大棚</td>
                <td>21001</td>
                <td>张三</td>
                <td>13012345678</td>
                <td>监控中</td>
                <td>2018-09-09 16:56:20</td>
            </tr>
            <tr>
                <td>3</td>
                <td>3号大棚</td>
                <td>21001</td>
                <td>王五</td>
                <td>13085743620</td>
                <td>监控中</td>
                <td>2018-09-09 16:56:20</td>
            </tr>
            <tr>
                <td>5</td>
                <td>5号大棚</td>
                <td>21001</td>
                <td>小华</td>
                <td>13752429123</td>
                <td>非监控</td>
                <td>2018-09-09 16:56:20</td>
            </tr>
        </table>
    </div>
</div>


<script type="text/javascript" src="/static/js/com/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="/static/js/com/bui-min.js"></script>
<script type="text/javascript" src="/static/js/com/config-min.js"></script>

<%--<script type="text/javascript" src="/static/js/systemManage/deviceManage.js"></script>--%>
</body>
</html>

