<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>中国平安</title>
	
    <link rel="stylesheet" type="text/css" href="./css/jquery.mobile-1.4.3.min.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.mobile-1.4.3.min.js"></script>
    <script type="text/javascript" src="js/unslider.min.js"></script>
    <script type="text/javascript" src="js/index.js"></script>
</head>
<body>
	<div id="header">
    	<div id="header-title">
        	<img src="images/pingan.png" id="header-logo"/>
        </div>
    </div>
    
   <div id="ad-area">
   <div class="theBanner">
      <ul>
        <li><img src="images/gg.png" id="ad"/></li>
        <li><img src="images/gg.png" id="ad"/></li>
        <li><img src="images/gg.png" id="ad"/></li>
        <li><img src="images/gg.png" id="ad"/></li>
      </ul>
    </div>
	<!--<img src="images/gg.png" id="ad"/>-->
<!--
        <div id="point-group">
            <img src="images/point-white.png" class="ad-point"/>
            <img src="images/point-white.png" class="ad-point"/>
            <img src="images/point-white.png" class="ad-point"/>
            <img src="images/point-color.png" class="ad-point"/>
            <img src="images/point-white.png" class="ad-point"/>
        </div>
-->
    </div>
    <div id="menu-area">
    	<a href="login.jsp"><img src="images/button-login.png" class="button"></a>
    	<a href="reg.jsp"><img src="images/button-register.png" class="button"></a>
    	<a href="#exchange-list" data-rel="dialog" data-transition="slidedown" ><img src="images/button-credit.png" class="button"></a>
    	<img src="images/button-upload.png" class="button">
    	<img src="images/button-service.png" class="button">
    	<img src="images/button-account.png" class="button">
    	<img src="images/button-setting.png" class="button">
    	<img src="images/button-feedback.png" class="button">
    </div>
    <div class="divide"></div>
    <div id="exchange-list">
        <a href="details.jsp"><img src="images/item-washcar.png" class="list list-left"/></a>
        <img src="images/item-vertify.png" class="list list-right"/>
        <img src="images/item-drive.png" class="list list-left"/>
        <img src="images/item-maintain.png" class="list list-right"/>
        <img src="images/item-food.png" class="list list-left"/>
        <img src="images/item-ktv.png" class="list list-right"/>
    </div>
</body>
</html>