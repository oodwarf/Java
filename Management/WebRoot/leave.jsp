<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'leave.jsp' starting page</title>
    
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

      body {
        padding: 100px;
      }

      textarea {
        width: 200px;
        height: 100px;
        border: 1px solid pink;
        outline: none;
        resize: none;
      }

      ul {
        margin-top: 50px;
      }

      li {
        width: 300px;
        padding: 5px;
        background-color: #eee;
        font-size: 14px;
        margin: 15px 0;
      }

      li a {
        float: right;
      }
      a{
      text-decoration: none;
      }
    </style>
  </head>
  <body bgcolor="antiquewhite">
    <textarea name="" id=""></textarea>
    <button>发布</button>
    <h3><a href=<%=path %>/home.jsp>返回大厅</a></h3>
    <ul></ul>
    <script>
      // 1. 获取元素
      var btn = document.querySelector('button');
      var text = document.querySelector('textarea');
      var ul = document.querySelector('ul');
      // 2. 注册事件
      btn.onclick = function () {
        if (text.value == '') {
          alert('您没有输入内容');
          return false;
        } else {
          // (1) 创建元素
          var li = document.createElement('li');
          // li.innerHTML = text.value;
          li.innerHTML = text.value + '<a href="javascript:;">删除</a>';
          // (2) 添加元素
          ul.insertBefore(li, ul.children[0]);
          var as = document.querySelectorAll('a');
          for (var i = 0; i < as.length; i++) {
            as[i].onclick = function () {
              ul.removeChild(this.parentNode);
            };
          }
        }
      };
    </script>
  </body>
</html>
