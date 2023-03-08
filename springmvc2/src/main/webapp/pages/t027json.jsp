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
<script src="../jquery-3.6.3.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>演示Json字符串与Java对象转换</h2>
<script>
    //页面加载完毕
    $(function(){
        //点击按钮，发送post请求，传递json参数
        $("#btn").click(function(){
            var user = {
                "username":"张三",
                "age":12
            };
            $.ajax({
                //设置请求类型
                type:'post',
                //请求路径
                url:'${path}/t02/json',
                //传递json参数
                data: '{"username":"小红","age":18,"address":{"省份":"江苏"}}',
                //指定参数类型（如果json参数格式，必须设置为json类型）
                contentType: 'application/json;charset=utf-8',
                //该方法接收后台返回的数据格式
                dataType: 'JSON',
                //处理方法
                success:function(result){
                    alert(result.username+'--'+result.age);
                }

            });
        });
    });

</script>

<input type="button" value="演示Json字符串与Java对象转换" id="btn">
</body>
</html>
