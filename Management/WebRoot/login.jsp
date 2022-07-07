<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
   <h1>登录</h1>
   <form action="" method="post">
   <p>用户名：<input type="text" name="username"></p>
   <p>密&nbsp;&nbsp;码：<input type="text" name="password"></p>
   <p>
   <button><a href=<%=path%>/hall.jsp>登录</button>

   <input type="reset" value="取消"></p>
   <p><input type="radio" value="2" name="type">普通用户<input type="radio" value="1" name="type">管理员</p>
   </form>
   </div>
  </body>
</html>
