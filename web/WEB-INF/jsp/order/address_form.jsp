<%--
  Created by IntelliJ IDEA.
  User: Zjy66i
  Date: 2019/12/10
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>收货地址</title>
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/order.address.js"></script>

</head>
    <body>
        <div class="login_step">
            生成订单骤: 1.确认订单 >
            <span class="red_bold"> 2.填写送货地址</span> > 3.订单成功
        </div>
        <div class="fill_message">
            <%--<p>
                选择地址：
                <select id="address">
                    <option value="-1">
                        填写新地址
                    </option>
                </select>
            </p>--%>
            <form name="ctl00" method="post" action="orderSubmit" id="f">
                <s:token></s:token>
                <input type="hidden" name="addr.id" id="addressId" value="-1"/>

                <table class="tab_login">
                    <tr>
                        <td valign="top" class="w1">
                            收件人姓名：
                        </td>
                        <td>
                            <input type="text" class="text_input" name="addr.receive_name"
                                   id="receiveName" />
                            <div class="text_left" id="nameValidMsg">
                                <p>
                                    请填写有效的收件人姓名
                                </p>
                                <span style="color:red"></span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" class="w1">
                            收件人详细地址：
                        </td>
                        <td>
                            <input type="text" name="addr.full_address" class="text_input"
                                   id="fullAddress" />
                            <div class="text_left" id="addressValidMsg">
                                <p>
                                    请填写有效的收件人的详细地址(省/市（区）/县/街道)
                                </p>
                                <span style="color:red"></span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" class="w1">
                            邮政编码：
                        </td>
                        <td>
                            <input type="text" class="text_input" name="addr.postal_code"
                                   id="postalCode" />
                            <div class="text_left" id="codeValidMsg">
                                <p>
                                    请填写有效的收件人的邮政编码
                                </p>
                                <span style="color:red"></span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" class="w1">
                            手机号码：
                        </td>
                        <td>
                            <input type="text" class="text_input" name="addr.mobile"
                                   id="mobile" />
                            <div class="text_left" id="mobileValidMsg">
                                <p>
                                    请填写有效的收件人的手机号码<span style="color:green">&nbsp;&nbsp;&nbsp;</span>
                                </p>
                                <span style="color:red"></span>
                            </div>
                        </td>
                    </tr>
                </table>

                <div class="login_in">

                    <a href="confirm"><input id="btnClientRegister2" class="button_1" name="submit"
                                             type="button" value="取消" /></a>

                    <input id="btnClientRegister" class="button_1" name="submit"
                           type="submit" value="下一步" />
                </div>
            </form>
        </div>
    </body>
</html>
