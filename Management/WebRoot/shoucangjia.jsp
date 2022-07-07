<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shoucangjia.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	div{
				padding-top: 100px;
				padding-left: 31.25rem;
			}
	</style>
  </head>
  
  <body bgcolor="antiquewhite">
  <div>
	<c:if test="${glist==null }">
		<h1>您的收藏夹尚未添加内容</h1>
	</c:if>
	<c:if test="${glist!=null }">
		<h1>您的收藏夹内容如下：</h1>
		<table>
			<tr>
				<td>图书编号</td>
				<td>图书名称</td>
				<td>单本售价</td>
				<td>库存数量</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${glist }" var="message">
				<tr>
					<td>${message.id }</td>
					<td>${message.name }</td>
					<td>${message.position }</td>
					<td>${message.num }</td>
					<td><a href=<%=path %>/servlet/DeleteShouCangJiaServlet?id=${message.id }>删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<h3><a href=<%=path %>/hall.jsp>返回大厅</a></h3>
	</div>
</body>
</html>
