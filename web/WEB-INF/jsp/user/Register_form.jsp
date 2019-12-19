<%--
  Created by IntelliJ IDEA.
  User: 63231
  Date: 2019/11/15
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>--注册--</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/user.register.js"></script>
</head>
<body>

<div class="fill_message">
    <form name="ctl00" method="post" action="regist" id="f">
        <s:token></s:token>
        <h2>
            以下均为必填项
        </h2>
        <table class="tab_login" >
            <tr>
                <td valign="top" class="w1">
                    设置您的昵称：                </td>
                <td>

                    <input name="user.username" type="text" id="txtuserName" class="text_input" />
                    <div class="text_left" id="userNameValidMsg">
                        <p>
                            您的昵称可以由小写英文字母、中文、数字组成                        </p>
                        <span id="name.info" style="color:red"></span>                    </div>                </td>
            </tr>
            <tr>
                <td valign="top" class="w1">
                    设置密码：                </td>
                <td>
                    <input name="user.password" type="password" id="txtPassword"
                           class="text_input" />
                    <div class="text_left" id="passwordValidMsg">
                        <p>
                            您的密码可以由大小写英文字母、数字组成，长度6－20位。                        </p>
                        <span id="password.info" style="color:red"></span>                    </div>                </td>
            </tr>
            <tr>
                <td valign="top" class="w1">
                    再次输入您设置的密码：
                </td>
                <td>
                    <input name="repwd" type="password" id="txtRepeatPass"
                           class="text_input"/>
                    <div class="text_left" id="repeatPassValidMsg">
                        <span id="repassword.info" style="color:red"></span>
                    </div>
                </td>
            </tr>

            <%--<tr>
                <td>手机号: </td>
                <td><input name="user.phone" type="text" id="txtPhone" class="text_input"></td>
            </tr>
            <tr>
                <td>验证码: </td>
                <td>
                    <input name="verifyCode"><button type="button" class="sendVerifyCode">获取短信验证码</button>
                </td>
            </tr>--%>
        </table>

        <div class="login_in">

            <input id="btnClientRegister" class="button_1" name="submit"  type="submit" value="注 册"/>
        </div>
    </form>
</div>
</body>
</html>
