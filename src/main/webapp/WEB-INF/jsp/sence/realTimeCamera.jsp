<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
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
            <button id="cancle" class="btn btn-primary">取消</button>
        </div>
    </div>
    <div id="id5" style="display: none">
        <div id="id6">
            <canvas id="canvas" width="640" height="480"></canvas>
            <input id='imgBase' value='' type="hidden">
            <input id='imgMushRoom' value='' type="hidden">
            <input id='userName' value='${userBean.getUserName()}' type="hidden">
            <input id='userId' value='${userBean.getUserId()}' type="hidden">
        </div>
        <div id="id7">
            <button id="sendImg" onClick="sendCanvasIamge()" type="button" class="btn btn-primary">上传图片</button>
        </div>
    </div>
</div>


<div>
    <div id='img'>
        <img id='id8' width="640" height="480" src="" style="display: none"/>
    </div>
</div>
</body>
<script type="text/javascript" src="/static/userInfo/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="/static/userInfo/js/bui-min.js"></script>
<script type="text/javascript" src="/static/userInfo/js/config-min.js"></script>
<script type="text/javascript" src="/static/js/sence/realTimeCamera.js"></script>

</html>