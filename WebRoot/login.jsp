<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- 
 要理解为什么添加String path 和string basePash 
 因为访问地址栏中的路径不对，需要提交给news才能转到界面
 还有<head></head>也要添加 
 
  -->
  <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <base href="<%=basePath%>">
 	<link rel="stylesheet" type="text/css" href="css/logining.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
  <form action="user.do?a=checklogin"  method="post">
  用户名：<input name="username"/><br/>
  密码：<input type="password" name="password" /><br/>
  <input type="submit" value="登录"/>
  </form>
</body>
</html>