<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="./css/jquery.mobile-1.4.3.min.css">
<link rel="stylesheet" type="text/css" href="./css/index.css">

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript" src="js/jquery.mobile-1.4.3.min.js"></script>
<title>会员登录</title>
</head>

<body>
	<div id="sub-page-header">
    	<a href="index.jsp" class="ui-nodisc-icon ui-alt-icon ui-icon-carat-l ui-btn-icon-left"></a><div id="title-text">免 费 洗 车</div>
    </div>
    
    <div class="container" style="padding-top:5em">
    	<div id="img-area"><img src="images/item-washcar.png" class="img-display"/></div>
        
        <div class="credit-area">
        	<div class="need-credit" style="float:left">需要积分: <font color="#f60">100</font>~<font color="#f60">300</font>分</div>
            <a href="getallTagfromshop?paserviceinfoid=<s:property value='#session.paserviceinfoid'/>" class="ui-btn my-btn my-btn-adjust" style="float:right; font-size:1em">立即兑换</a>
        </div>
    </div>
    
    <div class="block">
    	<div class="sub-title"><div class="sub-title-text">标题一</div></div>
        <div class="container">
        	<div class="info">
        		<s:property value="#session.serviceinfo.tag1"/>
        	</div>
        </div>
    </div>
    
    <div class="block">
    	<div class="sub-title"><div class="sub-title-text">标题一</div></div>
        <div class="container">
        	<div class="info">
        		<s:property value="#session.serviceinfo.tag2"/>
        	</div>
        </div>
    </div>
    
    <div class="block">
    	<div class="sub-title"><div class="sub-title-text">标题一</div></div>
        <div class="container">
        	<div class="info">
        		<s:property value="#session.serviceinfo.tag3"/>
        	</div>
        </div>
    </div>
    
    <div class="block">
    	<div class="sub-title"><div class="sub-title-text">标题一</div></div>
        <div class="container">
        	<div class="info">
        		<s:property value="#session.serviceinfo.tag4"/>
        	</div>
        </div>
    </div>
    
    <div class="block">
    	<div class="sub-title"><div class="sub-title-text">标题一</div></div>
        <div class="container">
        	<div class="info">
        		<s:property value="#session.serviceinfo.tag5"/>
        	</div>
        </div>
    </div>
</body>
</html>
