<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <form action="news.do?a=save"  method="post">
   <table width="600">
   <tr>
   		<td>新闻标题：</td>
   		<td><input name="title"/></td>
   </tr>
      <tr>
   		<td>新闻分类：</td>
   		<td>
   		<select name="type">
   		<c:forEach items="${typelist}" var ="t">
   		<option value="${t.id} ">${t.typename}</option>
   		</c:forEach>
   		</select>
   		</td>
   </tr>
      <tr>
   		<td>新闻作者：</td>
   		<td><input name="author"/></td>
   </tr>
      <tr>
   		<td>新闻图片：</td>
   		<td><input name="pic"/></td>
   </tr>
      <tr>
   		<td>新闻说明：</td>
   		<td><input name="note"/></td>
   </tr>
      <tr>
   		<td>新闻内容：</td>
   		<td><textarea  name="context" rows="6" cols="40"></textarea></td>
   </tr>

      <tr>
   		<td>&nbsp;</td>
   		<td><input type="submit"/></td>
   </tr>
   </table>
   </form>
  </body>
</html>
