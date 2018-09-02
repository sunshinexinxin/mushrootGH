<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title> 个人中心</title>

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
</div>
<div class="detail-section">

    <h2>
        基地信息
        <br/>
    </h2>

    <div>
        <table class="table table-bordered table-hover" id="table">
            <thead>
            <tr bgcolor=#C1CDCD>
                <th>基地编号</th>
                <th>基地名称</th>
                <th>负责人ID</th>
                <th>描述信息</th>
                <th>监控状态</th>
                <th>大棚经度</th>
                <th>大棚纬度</th>
                <th>大棚状态</th>
                <th>创建时间</th>
                <th>操作</th>
            </tr>
            </thead>
        </table>
    </div>
</div>


<script type="text/javascript" src="/static/js/com/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="/static/js/com/bui-min.js"></script>
<script type="text/javascript" src="/static/js/com/config-min.js"></script>

<script type="text/javascript" src="/static/js/systemManage/baseManage.js"></script>
</body>
</html>  

