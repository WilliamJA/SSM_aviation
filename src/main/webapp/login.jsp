<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2018/3/18
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/user/login" method="post">
    <label>userName:
        <input type="text" name="account">
    </label><br>
    <label>password:
        <input type="text" name="password">
    </label><br>
    <label>
        <input type="submit" value="登录">
    </label><br>
</form>


</body>
</html>
