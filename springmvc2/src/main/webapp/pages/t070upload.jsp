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
    <title>文件上传</title>
</head>
<body>
<h3>SpringMVC方式文件上传</h3>
<form action="${path}/t07/upload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="imgFile"> <br/>
    文件描述：<input type="text" name="memo"> <br/>
    <input type="submit" value="上传">
</form>
</body>
</html>