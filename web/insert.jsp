<%--
  Created by IntelliJ IDEA.
  User: 63231
  Date: 2019/11/1
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.sql.*,main.test.DBConfig" contentType="text/html;charset=gb2312"  %>
<html>
<head>
    <title>提示页面</title>
</head>
<body>
<%
    request.setCharacterEncoding("gb2312");
    String userno = request.getParameter("un");
    String pwno = request.getParameter("pw");

    Class.forName(DBConfig.getValue("driver"));
    Connection conn = DriverManager.getConnection(DBConfig.getValue("url"), DBConfig.getValue("username"), DBConfig.getValue("password"));
    String sql =
            "insert into t_user (username,password) values (?,?)";

    PreparedStatement ps = conn.prepareCall(sql);
    ps.setString(1,userno);
    ps.setString(2,pwno);
    ps.executeUpdate();

    out.print("注册成功！");

    ps.close();
    conn.close();
%>

</body>
</html>
