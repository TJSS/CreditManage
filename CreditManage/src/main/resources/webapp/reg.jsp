<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="./css/jquery.mobile-1.4.3.min.css">
<link rel="stylesheet" type="text/css" href="./css/index.css">
<link rel="stylesheet" type="text/css" href="./css/main.css">

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript" src="js/jquery.mobile-1.4.3.min.js"></script>
<title>会员登录</title>
</head>

<body>
	<div id="sub-page-header">
    	<a href="index.jsp" class="ui-nodisc-icon ui-alt-icon ui-icon-carat-l ui-btn-icon-left"></a><div id="title-text">会 员 注 册</div>
    </div>
    
    <div class="container">
    	<div id="inputform" style="padding-top:5em">
            <form onSubmit="return formSubmit();" action="registerUser" method="post" data-ajax="false">
                <div class="ui-field-contain">
                    <label for="textinput-disabled" class="vmiddle">用 户 名:</label>
                    <input type="text" name="username" id="username" placeholder="请输入用户名" value="" class="ui-corner-all">
                </div>
                <div class="ui-field-contain">
                    <label for="textinput-disabled" class="vmiddle">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</label>
                    <input type="password" name="password" id="password" placeholder="请输入密码" value="" class="ui-corner-all">
                </div>
                <div class="ui-field-contain">
                    <label for="textinput-disabled" class="vmiddle">确认密码:</label>
                    <input type="password" name="repassword" id="repassword" placeholder="请再次输入密码" value="" class="ui-corner-all ">
                </div>
                <div class="ui-field-contain">
                    <label for="textinput-disabled" class="vmiddle">车 牌 号:</label>
                    <input type="text" name="carnum" id="carnum" placeholder="请输入车牌号" value="" class="ui-corner-all">
                </div>
                <div class="ui-field-contain">
                    <label for="textinput-disabled" class="vmiddle">联系电话:</label>
                    <input type="text" name="phone" id="phone" placeholder="请输入联系电话" value="" class="ui-corner-all">
                </div>
                <div class="ui-field-contain">
                    <label for="textinput-disabled" class="vmiddle">电子邮件:</label>
                    <input type="text" name="email" id="email" placeholder="请输入邮箱" value="" class="ui-corner-all">
                </div>
                 <label style="font-size:0.8em">
                    <input type="checkbox" name="checkbox-0" checked="true">我已看过并同意<a href="#">《XXX服务协议》</a>
                </label>
                <div class="ui-field-contain">
                  <button class="ui-btn my-btn">立即注册</button>
                </div>
            </form>
            <s:actionmessage />
            <s:actionerror />
        </div>
	</div>
</body>

<script>
	function formSubmit(){
		if($("#username").val() == '' ||
			$("#password").val() == '' ||
			$("#repassword").val() == '' ||
			$("#carnum").val() == ''
		){
			return false;
		}
		
		if($("#password").val() != $("#repassword").val()){
			return false;
		}
		return true;
	}
</script>
</html>
