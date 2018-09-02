<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title> 个人中心</title>

    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/main/min/Styles/admin-all.css"/>
    <link rel="shortcut icon" href="/static/image/favicon.ico"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="/static/userInfo/css/dpl-min.css" rel="stylesheet" type="text/css"/>
    <link href="/static/userInfo/css/bui-min.css" rel="stylesheet" type="text/css"/>
    <link href="/static/userInfo/css/page-min.css" rel="stylesheet" type="text/css"/>
    <!-- 下面的样式，仅是为了显示代码，而不应该在项目中使用-->
    <link href="/static/userInfo/css/prettify.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<div class="alert alert-info">
    当前位置
    <b class="tip"></b>
    <a href="/mushRoomMapPage">首页</a>
    <b class="tip"></b>
    个人中心
</div>

<div class="table table-bordered table-hover">
    <div class="detail-page">
        <%--<h2>用户信息</h2>--%>
        <div class="detail-section">
            <h3>基本信息</h3>
            <div class="row detail-row ">
                <div class="span8">
                    <label>编号：${userBean.getUserId()}
                </div>
                <div class="span8">
                    <label>姓名：${userBean.getUserName()}
                </div>
                <div class="span8">
                    <label>年龄：${userBean.getUserAge()}
                </div>
            </div>
            <div class="row detail-row">
                <div class="span8">
                    <label>手机号：${userBean.getUserPhone()}
                </div>
                <div class="span8">
                    <label>地址：${userBean.getUserAdd()}
                </div>
                <div class="span8">
                    <label>岗位：<span id="a">ddd</span></label>
                    <script type="text/javascript">
                        if (${userBean.getStatus()}==0
                        )
                        {
                            document.getElementById("a").innerHTML = "开发测试岗";
                        }
                        else
                        if (${userBean.getStatus()}==1
                        )
                        {
                            document.getElementById("a").innerHTML = "普通用户";
                        }
                        else
                        if (${userBean.getStatus()}==2
                        )
                        {
                            document.getElementById("a").innerHTML = "管理员";
                        }
                    </script>
                </div>
            </div>
            <div class="row detail-row">
                <div class="span8">
                    <label>备注：${userBean.getMemo()}
                </div>
                <div class="span8">
                    <label>入职时间：${userBean.getCtime()}
                </div>
            </div>
        </div>

        <div class="detail-section">
            <h3>
                大棚信息
            </h3>
            <div>
                <table class="table table-bordered table-hover" id="table">
                    <thead>
                    <tr bgcolor=#C1CDCD>
                        <th>大棚编号</th>
                        <th>中文名称</th>
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

    </div>
</div>


<script type="text/javascript" src="/static/userInfo/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="/static/userInfo/js/bui-min.js"></script>
<script type="text/javascript" src="/static/userInfo/js/config-min.js"></script>

<script type="text/javascript" src="/static/js/sence/userInfo.js"></script>
</body>
</html>  

