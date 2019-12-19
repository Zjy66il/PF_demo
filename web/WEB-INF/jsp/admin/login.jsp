<%--
  Created by IntelliJ IDEA.
  User: 63231
  Date: 2019/12/19
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>登录 - 购书网</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>

</head>
<body>
<div class="enter_part">
    <div class="enter_in">
        <div class="center">
            <div class="admin">
                <h3>
                    登录
                </h3>

                <form method="post" action="adminAction" id="ctl00">

                    <ul>
                        <li>
                            <span>用户名:</span>
                            <input type="text" name="admin.root" id="txtRoot" class="textbox" />
                        </li>
                        <li>
                            <span class="blank">密码：&nbsp;</span>
                            <input type="password" name="admin.password" id="txtPassword"
                                   class="textbox" />
                        </li>
                        <li>
                            <input type="submit" id="btnSignCheck" class="button_enter"
                                   value="登 录" />
                        </li>
                    </ul>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
