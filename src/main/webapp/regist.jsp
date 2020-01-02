<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
常规方法
<form method="post" action="/user/regist">

    用户名：<input name="username"><br/>
    密码：<input name="password" type="password"><br/>
    <input type="submit" value="注册">
</form>
<hr/>
动态方法调用
<form method="post" action="/user/user!regist">
    <%--追加前缀的路径需要用user!regist来请求--%>
    用户名：<input name="username"><br/>
    密码：<input name="password" type="password"><br/>
    <input type="submit" value="注册">
</form>
<hr/>
通配符动态方法调用
<form method="post" action="/user/registUser">
    <%--追加前缀的路径需要用user!regist来请求--%>
    用户名：<input name="username"><br/>
    密码：<input name="password" type="password"><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
