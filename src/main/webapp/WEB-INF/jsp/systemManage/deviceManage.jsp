<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>设备管理</title>

    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/admin-all.css"/>
    <link rel="stylesheet" type="text/css"
          href="/static/switch/bootstrap-switch-master/dist/css/bootstrap3/bootstrap-switch.css"/>
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
    系统管理
    <b class="tip"></b>
    设备管理
</div>
<div class="detail-section">

    <h2>
        设备列表
        <br/>
    </h2>

    <div>
        <table class="table table-bordered table-hover" id="table">
            <thead>
            <tr bgcolor=#C1CDCD>
                <th>基地编号</th>
                <th>基地名称</th>
                <th>大棚编号</th>
                <th>大棚名称</th>
                <th>设备编号</th>
                <th>设备名称</th>
                <th>设备状态</th>
                <th>维护人员</th>
                <th>创建时间</th>
            </tr>
            </thead>
            <tr>
                <td>21001</td>
                <td>1号基地</td>
                <td>21001001</td>
                <td>1号大棚</td>
                <td>21001001002</td>
                <td>风机</td>
                <td>已开</td>
                <td>tes2</td>
                <td>2018-09-09 16:56:20</td>
            </tr>
            <tr>
                <td>21001</td>
                <td>1号基地</td>
                <td>21001002</td>
                <td>2号大棚</td>
                <td>21001002004</td>
                <td>补光灯</td>
                <td>已开</td>
                <td>tes1</td>
                <td>2018-09-09 16:56:35</td>
            </tr>
            <tr>
                <td>21001</td>
                <td>1号基地</td>
                <td>21001002</td>
                <td>2号大棚</td>
                <td>21001002001</td>
                <td>卷帘门</td>
                <td>已开</td>
                <td>test1</td>
                <td>2018-09-09 16:56:20</td>
            </tr>
            <tr>
                <td>21001</td>
                <td>1号基地</td>
                <td>21001003</td>
                <td>3号大棚</td>
                <td>21001003003</td>
                <td>摄像头</td>
                <td>已关</td>
                <td>test1</td>
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

