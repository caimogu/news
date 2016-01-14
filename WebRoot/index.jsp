<%@ page language="java" pageEncoding="UTF-8"%>
<!-- 
/*还能出现 index.jsp (line: 1, column: 45) The JSP specification requires that an attribute name is preceded by whitespace这个错误，
因为上面的jsp标签中 没有空格！！
*/
 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/login.css">

  </head>
  
  <body>
  <ul>
    <li><a href="login.jsp">后台管理</a></li>
  </ul>
  </body>
</html>
