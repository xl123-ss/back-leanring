<%--
  Created by IntelliJ IDEA.
  User: xuelong
  Date: 2023/2/4
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<h2>数组封装</h2>
<form action="${path}/t02/array">
    用户名：<input type="text" name="names"><br>
    用户名：<input type="text" name="names"><br>
    用户名：<input type="text" name="aaaa"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
