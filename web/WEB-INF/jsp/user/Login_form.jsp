<%--
  Created by IntelliJ IDEA.
  User: 63231
  Date: 2019/11/12
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>登录 - 购书网</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/user.login_form.js"></script>

</head>
<body>
<div class="enter_part">
    <div class="enter_in">
        <div class="bj_top"></div>
        <div class="center">
            <div style="height: 30px; padding: 5px; color: red" id="divErrorMssage">

            </div>
            <div class="main">
                <h3>
                    登录</h3>

                <form method="post" action="login" id="ctl00">

                    <ul>
                        <li>
                            <span>用户名:</span>
                            <input type="text" name="user.username" id="txtUsername" class="textbox" />
                        </li>
                        <li>
                            <span class="blank">密码：&nbsp;</span>
                            <input type="password" name="user.password" id="txtPassword"
                                   class="textbox" />
                        </li>
                        <li>
                            <input type="submit" id="btnSignCheck" class="button_enter"
                                   value="登 录" />


                        </li>
                    </ul>
                    <span style="color:red" id="txtLoginErr">${login_err }</span>
                    <input type="hidden" name="uri" value="${uri}" />
                </form>
            </div>
            <div class="user_new">
                <p>
                    您还不是我们的用户？
                </p>
                <p class="set_up">
                    <a href="${pageContext.request.contextPath}/user/toRegistAction">创建一个新用户&gt;&gt;</a>
                </p>
            </div>
        </div>
    </div>
</div>
</body>
</html>


