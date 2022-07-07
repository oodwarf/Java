<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
	<h1>注册页面</h1>
	<h2 style="color:red">${msg }</h2>
	<form action="servlet/RegisterUserServlet" method="post">
		<p>
			用户名：<input type="text" name="username" id="username"
				onblur="sendAjax()"><span id="umsg"></span>
		</p>
		<p>
			密&nbsp;&nbsp;码：<input type="password" name="password">
		</p>
		<p>确认密码：<input type="password" name="repassword"></p>
		<p>
			<input type="submit" value="注册" id="reg" disabled="disabled">
			<input type="reset" value="取消">
		</p>
	</form>
	</div>
</body>
<script>
	//ajax的请求对象
	var xmlHTTPRequest;
	//函数1  创建ajax请求对象
	function create() {
		if (window.XMLHttpRequest) {
			//非ie浏览器

			xmlHTTPRequest = new XMLHttpRequest();
		} else {
			xmlHTTPRequest = new ActiveXObject("Msxml.XMLHTTP");
		}
	}

	//方法2  获取ajax执行结果
	function getResult() {
		if (xmlHTTPRequest.readyState == 4) {
			if (xmlHTTPRequest.status == 200) {

				// alert(xmlHTTPRequest.responseText);
				var ret = xmlHTTPRequest.responseText;
				var msg;
				if (ret == "1") {
					msg = "该用户已被注册，请重新输入";
					document.getElementById("reg").disabled = "disabled";//用户名不符合规范
				} else {
					msg = "用户名可用";
					document.getElementById("reg").removeAttribute("disabled");
				}
				document.getElementById("umsg").innerHTML=msg;
			}
		}
		//console.log("结果："+xmlHTTPRequest.responseText);

	}

	//方法3 发送请求
	function sendAjax() {
		//获取输入的用户名
		var name = document.getElementById("username").value;
		//获取ajax请求对象
		create();
		//url
		var url = "servlet/CheckUserNameServlet?name="+name;
		//请求对象准备工作
		xmlHTTPRequest.open("get", url);

		//请求对象发送请求
		xmlHTTPRequest.send(null);

		//请求对象监控结果
		xmlHTTPRequest.onreadystatechange = getResult;
	}
</script>
</html>
