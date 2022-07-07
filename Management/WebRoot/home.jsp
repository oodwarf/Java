<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'home.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style>
* {
	margin: 0;
	padding: 0;
}

li {
	list-style-type: none;
}

.tab {
	width: 978px;
	margin: 100px auto;
}

.tab_list {
	height: 39px;
	border: 1px solid #ccc;
	background-color: #f1f1f1;
}

.tab_list li {
	float: left;
	height: 39px;
	line-height: 39px;
	padding: 0 20px;
	text-align: center;
	cursor: pointer;
}

.tab_list .current {
	background-color: burlywood;
	color: #fff;
}

.item_info {
	padding: 20px 0 0 20px;
}

.item {
	display: none;
}

button {
	margin: 7px;
	height: auto;
	width: 60px;
	float: right;
}

a {
	text-decoration: none;
	color: black;
}

a:hover {
	color: darksalmon;
}
</style>
</head>
<body bgcolor="antiquewhite">
	<div class="tab">
		<div class="tab_list">
			<ul>
				<li class="current">首页</li>
				<li><a href=<%=path%>/servlet/HallServlet>大厅</a></li>
				<li>公告栏</li>
				<li>社区</li>
				<li><a href=<%=path%>/leave.jsp>留言板</a>
				</li>
			</ul>

			<button>
				<a href=<%=path%>/login.jsp>登录</a>
			</button>
			<button>
				<a href=<%=path%>/register.jsp>注册</a>
			</button>
		</div>

	</div>

	<script>
		// 获取标签部分的所有元素对象
		var tab_list = document.querySelector('.tab_list');
		var lis = tab_list.querySelectorAll('li');
		// 获取内容部分的所有内容对象
		var items = document.querySelectorAll('.item');
		for ( var i = 0; i < lis.length; i++) { // for循环绑定点击事件
			lis[i].setAttribute('index', i); // 开始给5个小li设置索引号
			lis[i].onclick = function() {
				for ( var i = 0; i < lis.length; i++) {
					lis[i].className = '';
				}
				this.className = 'current';
				// 下面的显示内容模块
				var index = this.getAttribute('index');
				for ( var i = 0; i < items.length; i++) {
					items[i].style.display = 'none';
				}
				items[index].style.display = 'block';
			};
		}
	</script>
</body>
</html>

