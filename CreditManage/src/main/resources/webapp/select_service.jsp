<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">

<link rel="stylesheet" type="text/css" href="./css/jquery.mobile-1.4.3.min.css">
<link rel="stylesheet" type="text/css" href="./css/index.css">

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript" src="js/jquery.mobile-1.4.3.min.js"></script>

<title>服务选择</title>
</head>

<body>
	<div id="sub-page-header">
    	<a href="details.jsp" class="ui-nodisc-icon ui-alt-icon ui-icon-carat-l ui-btn-icon-left"></a><div id="title-text">服 务 选 择</div>
    </div>
    
    <div class="container" style="padding-top:5em;">
    	<form>
            <div class="ui-select">
                <select name="select-choice-a" id="select-choice-a" data-native-menu="false" tabindex="-1">
                    <option data-placeholder="true">请选择地区</option>
                    <option value="heping">和平区</option>
                    <option value="standard">河东区</option>
                    <option value="rush">南开区</option>
                    <option value="express">红桥区</option>
                    <option value="overnight">塘沽区</option>
                </select>
            </div>
            
            <div class="ui-select">
                <select name="select-choice-b" id="select-choice-b" data-native-menu="false" tabindex="-1">
                    <option data-placeholder="true">请选择店铺</option>
                    <option value="heping">洗车1</option>
                    <option value="standard">洗车2</option>
                    <option value="rush">洗车3</option>
                </select>
            </div>
            
            <div class="ui-select">
                <select name="select-choice-c" id="select-choice-c" data-native-menu="false" tabindex="-1">
                    <option data-placeholder="true">请选择车型</option>
                    <option value="heping">大车</option>
                    <option value="standard">中车</option>
                    <option value="rush">小车</option>
                </select>
            </div>
           	<div style="padding-top:1em">消耗积分：<font color="#f60">300</font>分</div>
            <div class="ui-field-contain"></div>
      </form>
    </div>
    <button class="my-btn">确认兑换</button>
</body>
</html>
