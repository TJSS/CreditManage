<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
    <!doctype html>
    <html>
        
        <head>
            <meta charset="utf-8">
            <link rel="stylesheet" type="text/css" href="./css/jquery.mobile-1.4.3.min.css">
            <link rel="stylesheet" type="text/css" href="./css/index.css">
            <script type="text/javascript" src="js/jquery.js">
            </script>
            <script type="text/javascript" src="js/login.js">
            </script>
            <script type="text/javascript" src="js/jquery.mobile-1.4.3.min.js">
            </script>
            <title>
                服务选择
            </title>
        </head>
        
        <body>
            <div id="sub-page-header">
                <a href="details.jsp" class="ui-nodisc-icon ui-alt-icon ui-icon-carat-l ui-btn-icon-left">
                </a>
                <div id="title-text">
                    服 务 选 择
                </div>
            </div>
            <div class="container" style="padding-top:5em;">
                <form>
                    <div class="ui-select">
                        <select name="tag1" id="select-choice-a" data-native-menu="false" tabindex="-1">
                            <option data-placeholder="true">
                                请选择地区
                            </option>
                            <s:iterator value="#session.allshoptags" id="tag" status="st">
                                <option value="<s:property value='#tag' />">
                                    <a href="getShopInfo?tag1=<s:property value='#tag'/>">
                                        <s:property value="tag" />
                                    </a>
                                </option>
                            </s:iterator>
                        </select>
                    </div>
                    <div class="ui-select">
                        <select name="shopid" id="select-choice-b" data-native-menu="false" tabindex="-1">
                            <option data-placeholder="true">
                                请选择店铺
                            </option>
                            <s:iterator value="#session.shopinfolist" id="shop" status="st">
                                <option value="<s:property value='#shop.shopid'/>">
                                    <s:property value="#shop.name" />
                                </option>
                            </s:iterator>
                        </select>
                    </div>
                    <div class="ui-select">
                        <select name="tag2" id="tag2" data-native-menu="false" tabindex="-1">
                            <option data-placeholder="true">
                                请选择车型
                            </option>
                            <s:iterator value="#session.allservicetags" id="servicetag" status="st">
                                <option value="<s:property value='#servicetag' />">
                                     <a href="getService?searchtag1=<s:property value='#servicetag' />&paserviceinfoid=<s:property value='#session.paserviceinfoid' />">
                                        <s:property value="#servicetag" />
                                    </a>
                                </option>
                            </s:iterator>
                        </select>
                    </div>
                    <div style="padding-top:1em">
                        消耗积分：
                        <font id="cost" color="#f60">
                            <s:property value="#session.servicelist[0].creditcost" />
                        </font>
                        分
                    </div>
                    <a href="addOrderList?orderlistPojo.paserviceid=<s:property value='#session.servicelist[0].paserviceid' />&username=<s:property value='#session.user.username' />" class="ui-btn my-btn">
                        确认兑换
                    </a>
                </form>
            </div>
        </body>
        <script type="text/javascript">
            $("#tag2").change(function() {
                $("tag2 option[@selected]").val();
            });
        </script>
    
    </html>