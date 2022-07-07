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
    
    <title>My JSP 'hall.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
a {
	text-decoration: none;
	color: black;
}

a:hover{
color: darksalmon;
}
div{
				padding-top: 100px;
				padding-left: 31.25rem;
			}
</style>
  </head>
  
  <body bgcolor="antiquewhite">
  <div>
    <table>
    <tr>
    <td>企业编号</td>
    <td>企业名称</td>
    <td>招聘岗位</td>
    <td>招聘人数</td>
    <td>操作</td>
    </tr>
    <c:forEach items="${sessionScope.list }" var="message">
    <tr>
    <td>${message.id }</td>
    <td>${message.name }</td>
    <td>${message.position }</td>
    <td>${message.num }</td>
    <td><a href=<%=path %>/servlet/AddShouCangJiaServlet?id=${message.id }>收藏</a></td>
    </tr>
    </c:forEach>
    </table>
    <button>
    <a href=<%=path %>/servlet/ShowShouCangJiaServlet>收藏夹</a>
    </button>
    <button>
	<a href=<%=path%>/home.jsp>返回首页</a>
	</button>
	</div>
  </body>
</html>
