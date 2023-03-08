<%--
  Created by IntelliJ IDEA.
  User: xuelong
  Date: 2023/2/7
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>一点教程网 - www.yiidian.com</title>
</head>
<body>
<h2>使用@CookieValue获取Cookie数据</h2>
<a href="${path}/t03/cookie">获取Cookie</a>
</body>
</html>
