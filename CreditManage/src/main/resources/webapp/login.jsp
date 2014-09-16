<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="./css/jquery.mobile-1.4.3.min.css">
<link rel="stylesheet" type="text/css" href="css/index.css">

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.mobile-1.4.3.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<title>会员登录</title>
</head>

<body>
	<div id="sub-page-header">
    	<a href="index.jsp" class="ui-nodisc-icon ui-alt-icon ui-icon-carat-l ui-btn-icon-left"></a><div id="title-text">会 员 登 录</div>
    </div>
    
    <div class="container">
    	<div id="inputform" style="padding-top:5em">
            <form id="login-form" action="login" method="post" data-ajax="false">
                <div class="ui-field-contain">
                    <label for="textinput-disabled" class="vmiddle">用 户 名:</label>
                    <input type="text" name="username" id="textinput" placeholder="请输入用户名" value="" class="ui-corner-all ui-shadow-inset">
                </div>
                <div class="ui-field-contain">
                    <label for="textinput-disabled" class="vmiddle">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</label>
                    <input type="password" name="password" id="textinput" placeholder="请输入密码" value="" class="ui-corner-all ui-shadow-inset">
                </div>
                <div class="ui-field-contain">
                    <button class="ui-btn my-btn">登录</button>
                </div>
            </form>
            <s:actionerror />
        </div>
    </div>

</body>
</html>
