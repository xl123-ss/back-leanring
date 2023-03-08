<%--
  Created by IntelliJ IDEA.
  User: xuelong
  Date: 2023/2/9
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>文件下载</title>
</head>
<body>
<h3>SpringMVC文件下载</h3>
<a href="${path}/t07/down">下载</a>

</body>
</html>