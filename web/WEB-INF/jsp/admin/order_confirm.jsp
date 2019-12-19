<%--
  Created by IntelliJ IDEA.
  User: 63231
  Date: 2019/12/19
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>


<html>
<head>
    <title>订单信息</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/desc.js"></script>
</head>
<body>
<div class="login_title">
    订单信息:
</div>
<div class="fill_message">

    <table class="tab_login">

        <tr>
            <td width="60" valign="top" class="w1" style="text-align: left">
                <b>订单号</b>                </td>
            <td width="80" valign="top" class="w1" style="text-align: left">
                <b>用户名</b>                </td>
            <td width="111" valign="top" class="w1" style="text-align: left">
                <b>订单时间</b>                </td>
            <td width="117" valign="top" class="w1" style="text-align: left">
                <b>总价格</b>                </td>
            <td width="117" valign="top" class="w1" style="text-align: left">
                <b>收货人</b>                </td>
            <td width="200" valign="top" class="w1" style="text-align: left">
                <b>收货地址</b>                </td>
            <td width="108" valign="top" class="w1" style="text-align: left">
                <b>邮编</b>                </td>
            <td width="112" valign="top" class="w1" style="text-align: left">
                <b>手机号码</b>                </td>
            <td width="104" valign="top" class="w1" style="text-align: left">
                <b>订单说明</b>                </td>
        </tr>
        <tr>
            <td valign="top" class="wl" style="text-align: left">
                <b>未发货</b>
            </td>
        </tr>
        <s:iterator value="unconfirmitems" var="i">
            <tr>
                <td valign="top">
                        ${i.id }
                </td>
                <td valign="top">
                        ${i.username }
                </td>
                <td valign="top">
                        ${i.order_time }
                </td>
                <td valign="top" >
                        ${i.total_price }
                </td>
                <td valign="top" >
                        ${i.receive_name}
                </td>
                <td valign="top" >
                        ${i.full_address}
                </td>
                <td valign="top" >
                        ${i.postal_code}
                </td>
                <td valign="top" >
                        ${i.mobile}
                </td>
                <td width="150" valign="top">
                        ${i.order_desc }
                </td>
                <td width="250" >
                    <input class="desc" type="text" size="20" maxlength="20"/>
                    <a href="${pageContext.request.contextPath}/admin/updatedesc?id=${i.id }&desc=">变更描述</a>
                </td>
                <td width="40">
                    <a href="${pageContext.request.contextPath}/admin/orderdeliver?id=${i.id }">发货</a>
                </td>
            </tr>
            <!-- 订单结束 -->
            <tr>
            </tr>
        </s:iterator>

        <tr>
            <td valign="top" class="wl" style="text-align: left">
                <b>已发货</b>
            </td>
        </tr>
        <s:iterator value="confirmitems" var="i">
            <tr>
                <td valign="top">
                        ${i.id }
                </td>
                <td valign="top">
                        ${i.username }
                </td>
                <td valign="top">
                        ${i.order_time }
                </td>

                <td valign="top" >
                        ${i.total_price }
                </td>
                <td valign="top" >
                        ${i.receive_name}
                </td>
                <td valign="top" >
                        ${i.full_address}
                </td>
                <td valign="top" >
                        ${i.postal_code}
                </td>
                <td valign="top" >
                        ${i.mobile}
                </td>
                <td valign="top">
                        ${i.order_desc }
                </td>
                <td width="250" >
                    <input class="desc" type="text" size="20" maxlength="20"/>
                    <a href="${pageContext.request.contextPath}/admin/updatedesc?id=${i.id }&desc=">变更描述</a>
                </td>
            </tr>
            <!-- 订单结束 -->
            <tr>
            </tr>
        </s:iterator>
    </table>
    <br />
    <br />
</div>
</body>
</html>