<%--
  Created by IntelliJ IDEA.
  User: xuelong
  Date: 2023/2/9
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>提示页面</title>
</head>
<body>
<!--增加 -->
<form action="${path}/t06/rest" method="post">
    <input type="submit" value="增加">
</form>

<!--查询 -->
<form action="${path}/t06/rest" method="get">
    <input type="submit" value="查询">
</form>

<!--修改 -->
<form action="${path}/t06/rest/1" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="修改">
</form>

<!--删除 -->
<form action="${path}/t06/rest/1" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="删除">
</form>
</body>
</html>
