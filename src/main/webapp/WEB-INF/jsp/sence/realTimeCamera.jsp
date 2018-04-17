<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8"/>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/admin-all.css"/>
</head>
<body>
<div class="alert alert-info">当前位置<b class="tip"></b>监控中心<b class="tip"></b>实时视频数据</div>
<div>
    <div>
        <div>
            <video id="video" width="640" height="480" autoplay style.left="0px" ;style.top="0px"></video>
        </div>
        <div>
            <button id="paizhao" class="btn btn-primary">拍照</button>
            <button onClick="downloadCanvasIamge()" type="button" class="btn btn-primary">下载图片</button>
        </div>
    </div>
    <canvas id="canvas" width="640" height="480"></canvas>
</div>
</body>
<script type="text/javascript" src="/static/js/sence/realTimeCamera.js"></script>

</html>