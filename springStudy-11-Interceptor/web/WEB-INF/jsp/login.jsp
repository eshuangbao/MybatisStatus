<%--
  Created by IntelliJ IDEA.
  User: sinosoft-2021
  Date: 2021/12/22
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%--在web-inf下的所有页面或者资源，只能通过controller，或者servlet进行访问--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input name="username" type="text">
    密码：  <input name="password" type="text">
    <input type="submit" value="提交">
</form>

</body>
</html>
