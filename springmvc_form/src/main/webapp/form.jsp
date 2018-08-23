<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>注册</h1>
    <br>
    <form method="post" action="register.do">
        <input type="text" name="name" placeholder="用户名"> ${errors.getFieldError("name").defaultMessage }<br>
        <input type="password" name="pwd" placeholder="密码"> ${errors.getFieldError("pwd").defaultMessage }<br>
        <input type="text" name="email" placeholder="邮箱"> ${errors.getFieldError("email").defaultMessage }<br>
        <input type="text" name="tel" placeholder="电话"> ${errors.getFieldError("tel").defaultMessage }<br>
         <input type="submit" value="注册">
    </form>
</body>
</html>