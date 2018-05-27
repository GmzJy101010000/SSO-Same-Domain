<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>SSO Login Page</title>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
  <center>
  <form action="/sso-struct2/ssoo/doLogin.action" method="post">
    <span>用户名：</span><input type="text" name="username">
     <span>密码：</span><input type="password" name="password">
     
     <input type="hidden" name="gotoURL" value="${gotoURL }">
  <br>
  <br>
  <input type="submit" value="登录">
  
  </form>
  </center>
</body>
</html>