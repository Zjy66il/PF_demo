<%--
  Created by IntelliJ IDEA.
  User: Zjy66i
  Date: 2019/11/22
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=utf-8"%>
<div class="head_container">

        <span class="head_toutext" id="logininfo">
		<b><span style="color:blue;font-size:15px">${s_user.username }</span>
		 您好，欢迎光临 </b>
		<%if(session.getAttribute("s_user")!=null){ %>
		[&nbsp;<a href="<%=request.getContextPath() %>/user/logout" class="b">登出</a>|<a
                href="${pageContext.request.contextPath}/cart/cart">购物车</a>|<a
				href="${pageContext.request.contextPath}/order/orderView">我的订单</a>&nbsp;]
		<%} else{%>

		[&nbsp;<a href="${pageContext.request.contextPath}/user/toLoginAction" class="b">登录</a>|<a
                href="${pageContext.request.contextPath}/user/toRegistAction" class="b">注册</a>&nbsp;]
		<%} %>
		</span>

    <div class="head_search_div"><b>0174934 zjy</b></div>
    <div class="head_search_bg"></div>
</div>