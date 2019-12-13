<%--
  Created by IntelliJ IDEA.
  User: Zjy66i
  Date: 2019/12/10
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>

<html>
<head>
    <title>生成订单</title>
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/css/page_bottom.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="login_step">
    生成订单骤:
    <span class="red_bold">1.确认订单</span> > 2.填写送货地址 > 3.订单成功
</div>
<div class="fill_message">

    <table class="tab_login">
        <tr>
            <td valign="top" class="w1" style="text-align: left">
                <b>序号</b>
            </td>
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

        <s:iterator value="items" var="i" status="sts">
            <!-- 订单开始 -->
            <tr>
                <td valign="top">
                        ${sts.count }
                </td>
                <td valign="top">
                        ${i.pro.book_name }
                </td>
                <td valign="top">
                        ${i.pro.discount_price }
                </td>
                <td valign="top">
                        ${i.num }
                </td>
                <td valign="top">
                        <%--${(i.pro.discount_price)*(i.num)}--%>
                        <fmt:formatNumber type="number" value="${i.pro.discount_price*i.num}" maxFractionDigits="2"/>
                </td>
            </tr>

            <!-- 订单结束 -->
        </s:iterator>

        <tr>
            <td valign="top" class="w1" style="text-align: left" colspan="5">
                <b>总价￥${totalPrice }</b>
            </td>
        </tr>
    </table>
    <br />
    <br />
    <br />
    <div class="login_in">
        <a href="../cart/cart"><input id="btnClientCancel" class="button_1" name="submit"
                                      type="submit" value="取消" /></a>

        <a href="addressForm"><input id="btnClientNext" class="button_1" name="submit"
                                     type="submit" value="下一步" /></a>

    </div>

</div>
</body>
</html>

