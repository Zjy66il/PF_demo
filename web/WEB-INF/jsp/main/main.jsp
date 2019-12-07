<%--
  Created by IntelliJ IDEA.
  User: Zjy66i
  Date: 2019/11/22
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>购书网</title>
</head>
<body>
<!-- 头部开始 -->
<%@include file="/common/head.jsp"%>
<!-- 头部结束 -->
<hr>
<div style="width: 962px; margin: auto;">
    <h5>
        百万图书，优质服务，买得放心，买的满意
    </h5>
</div>
<hr>
<div class="book">
    <div class="book_center">

        <div class=second_c_border1 id="recommend">
            <s:action name="showAction" namespace="/main" executeResult="true"></s:action>
        </div>

        <div class="clear">
        </div>
    </div>


    <div class="clear"></div>
</div>
</body>
</html>