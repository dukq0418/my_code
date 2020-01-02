<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
常规方法
<form method="post" action="/user/login">
    用户名：<input name="username"><br/>
    密码：<input name="password" type="password"><br/>
    <input type="submit" value="登录">
</form>
<hr/>
普通动态方法调用
<form method="post" action="/user/user!login">
    用户名：<input name="username"><br/>
    密码：<input name="password" type="password"><br/>
    <input type="submit" value="登录">
</form>
<hr/>
通配符动态方法调用
<form method="post" action="/user/loginUser">
    用户名：<input name="username"><br/>
    密码：<input name="password" type="password"><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>
