<%--
  Created by IntelliJ IDEA.
  User: Zjy66i
  Date: 2019/12/13
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>

<html>
<head>
    <title>订单信息</title>
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/css/page_bottom.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="login_title">
    您的订单信息:
</div>
<div class="fill_message">

    <table class="tab_login">
        <s:iterator value="items" var="i">
            <tr>
                <td valign="top" class="w1" style="text-align: left">
                    <b>商品名称</b>
                </td>
                <td valign="top" class="w1" style="text-align: left">
                    <b>商品单价</b>
                </td>
                <td valign="top" class="w1" style="text-align: left">
                    <b>商品数量</b>
                </td>
                <td valign="top" class="w1" style="text-align: left">
                    <b>小计</b>
                </td>
            </tr>
            <tr>
                <td valign="top">
                        ${i.product_name }
                </td>
                <td valign="top">
                        ${i.discount_price }
                </td>
                <td valign="top">
                        ${i.product_num }
                </td>
                <td valign="top">
                        <%--${(i.pro.discount_price)*(i.num)}--%>
                    <fmt:formatNumber type="number" value="${i.discount_price*i.product_num}" maxFractionDigits="2"/>
                </td>
                <td valign="top" class="w1" style="text-align: left">
                    <b>订单号:</b>
                        ${i.id}
                </td>
                <td valign="top" class="w1" style="text-align: left">
                    <b>总价</b>
                        ${i.total_price }
                </td>
            </tr>
            <!-- 订单结束 -->
        <tr>
            <td valign="top" class="w1" style="text-align: left" colspan="5">
                <b>订单状态:${items[0].order_desc }</b>
            </td>
        </tr>
        </s:iterator>
    </table>
    <br />
    <br />
    <div class="login_in">
        <a href="${pageContext.request.contextPath}/main/mainAction"> 继续挑选商品>></a>
    </div>

</div>
</body>
</html>
