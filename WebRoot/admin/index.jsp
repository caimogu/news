<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<!-- 两种方式   ..css/style 或者  添加head中的第一行 -->
	

  </head>
  
  <body>
  <div class ="contain">
  		<div class="header"> Welcome to ${user.username}<a href="user.do?a=exit">退出</a><br></div>
  		<div class="bodymain">
  				<div class="left">
  				<ul>
  				<li><a href="news.do" target="mainFrame">新闻管理</a></li>
  				<li>新闻分类管理</li>
  				<li><a href="user.do" target="mainFrame">用户管理</a></li>
  				</ul>
  				</div>
  				
  				
  				
  				
  				<div class ="right">
  					<iframe  name="mainFrame" src="" width="740"  height="600"  scrolling="auto" frameborder="1"></iframe>
  				</div>
  		</div>
  </div>
  </body>
</html>
