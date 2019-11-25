<%@ page import="main.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: 63231
  Date: 2019/11/6
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@page import="main.entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>用户注册 - ReBook网</title>
</head>
<body>
<div class="login_success">
    <div class="login_bj">
        <div class="succ">
            <img src="${pageContext.request.contextPath}/images/login_success.jpg" />
        </div>
        <h5>
            ${s_user.username }，欢迎加入!
        </h5>

        <ul>
            <li class="nobj">
                您现在可以：
            </li>
            <li>
                进入“
                <a href="${pageContext.request.contextPath}/cart/cart">我的购物车</a>”查看并管理您的购物信息
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/main/mainAction">浏览并选购商品</a>
            </li>
        </ul>
    </div>
</div>
</body>
</html>
