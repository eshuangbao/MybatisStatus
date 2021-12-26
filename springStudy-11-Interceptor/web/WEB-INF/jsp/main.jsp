<%--
  Created by IntelliJ IDEA.
  User: sinosoft-2021
  Date: 2021/12/22
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>首页</h1>
<h2>欢迎${username}</h2>
<a href="${pageContext.request.contextPath}/user/goout" >注销</a>
</body>
</html>
