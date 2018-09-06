<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>食用菌智慧农业系统</title>
    <link rel="shortcut icon" href="/static/image/favicon.ico"/>
    <link href="/static/login/css/style.css" rel="stylesheet"
          type="text/css" media="all"/>
    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords"
          content="Ensaluto Form Responsive,Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <!--Google Fonts-->
    <link
            href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
            rel='stylesheet' type='text/css'>
    <!--Google Fonts-->
    <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>

    <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet"/>
    <!--<link rel='stylesheet' type='text/css' href='/static/login/css/boostrap.css'/>-->
    <script src="/static/login/js/jquery.min.js"></script>

    <script>
        $(document).ready(function () {
            $(".forms.userName").focus();
        });


    </script>
</head>
<!--<body onLoad="document.forms.form.userName.focus()">-->
<body>
<!--sign up form start here-->
<div class="app">
    <div class="top-bar">
        <div class="navg">
					<span class="menu"> <img
                            src="/static/login/images/menu.png" alt=""/> </span>
            <ul class="res">
                <li>
                    <a class="active scroll" href="#coffee">Menu</a>
                </li>
                <li>
                    <a class="scroll" href="#about">Tools</a>
                </li>
                <li>
                    <a class="scroll" href="#about">Settings</a>
                </li>
                <li>
                    <a class="scroll" href="#contact">Login</a>
                </li>
            </ul>
            <script>
                $("span.menu").click(function () {
                    $("ul.res").slideToggle("slow", function () {
                        // Animation complete.
                    });
                });
            </script>
        </div>
        <h3>
            食用菌智慧农业系统
        </h3>
    </div>
    <br><br><br>
    <span>
        <form action="/mushRoomGH/login" method="post">
            <input type="text" name="userName" id="userName" value="" placeholder="用户名"/>
            <input type="password" name="userPwd" id="userPwd" value="" placeholder="密&nbsp码"/><br/>
            <input type="submit" value="登录" class='btn btn-default btn-lg' id="login"/>
            <!--<button class="btn btn-default btn-lg" id="login">登录</button>-->
            <%--<input type="hidden" id="data" value="${responseBean.getStatus()}"/>--%>
        </form>
    </span>
    <p>
        Copyright @ 2018 Graduation design
        <br>
        All Rights Reserved 韩奕昕
    </p>
</div>
<!--sign up form end here-->
<script type="text/javascript" src="/static/js/login/login.js"></script>
</body>
</html>