<%--
  Created by IntelliJ IDEA.
  User: xuelong
  Date: 2023/2/11
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${path}/t10/login2" method="post">
    用户名：<input type="date" name="username">${ERROR_username}<br/>
    年龄：<input type="text" name="age">${ERROR_age}<br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
