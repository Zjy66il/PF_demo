<%--
  Created by IntelliJ IDEA.
  User: Zjy66i
  Date: 2019/12/10
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单成功</title>
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <div class="login_step">
        生成订单步骤: 1.确认订单 > 2.填写送货地址 >
        <span class="red_bold">3.订单成功</span>
    </div>


    <div class="login_success">
        <div class="login_bj">
            <h5>
                订单已经生成
            </h5>
            <h6>
                您刚刚生成的订单号是：${order.id }，金额总计${order.total_price }
            </h6>

            <ul>
                <li class="nobj">
                    您现在可以：
                </li>
                <li>
                    <a href="../main/mainAction">继续浏览并选购商品</a>
                </li>
                <li>
                    <a href="../main/orderView">查看您的订单信息</a>
                </li>

            </ul>
        </div>
    </div>
</body>
</html>
