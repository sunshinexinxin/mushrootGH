<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8"/>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/admin-all.css"/>
    <link rel="stylesheet" type="text/css" href="/static/css/sence/realTimeCamera.css"/>
</head>
<body>
<div class="alert alert-info">当前位置<b class="tip"></b>监控中心<b class="tip"></b>实时视频数据</div>
<div id="id1">
    <div id="id2">
        <div id="id3">
            <video id="video" width="640" height="480" autoplay style.left="0px" ;style.top="0px"></video>
        </div>
        <div id="id4">
            <button id="paizhao" class="btn btn-primary">拍照</button>
        </div>
    </div>
    <div id="id5">
        <div id="id6">
            <canvas id="canvas" width="640" height="480"></canvas>
        </div>
        <div id="id7">
            <button id="downImg" onClick="downloadCanvasIamge()" type="button" class="btn btn-primary">下载图片</button>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="/static/userInfo/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="/static/userInfo/js/bui-min.js"></script>
<script type="text/javascript" src="/static/userInfo/js/config-min.js"></script>
<script type="text/javascript" src="/static/js/sence/realTimeCamera.js"></script>

</html>