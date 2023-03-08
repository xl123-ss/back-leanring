
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>
<%
    request.setAttribute("path", request.getContextPath());

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>基本类型参数封装</h2>
<%--
这里的user要对应
path要和字段名对应
--%>
<form:form modelAttribute="user" action="${path}/t10/login" method="post">
    用户名：<input type="text" name="username"><form:errors path="username"/> <br/>
    年龄：<input type="text" name="age"><form:errors path="age"/><br/>
    <input type="submit" value="登录">
</form:form>
</body>
</html>