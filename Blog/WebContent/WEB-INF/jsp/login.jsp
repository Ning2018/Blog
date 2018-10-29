<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">J2EE 博客</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="main.action">网站首页</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">	
				<li><a href="login_page.action">登录</a></li>
				<li><a href="register_page.action">注册</a></li>
			</ul>
		</div>
	</div>
	</nav>
	
	<div style="width: 700px" class="col-md-offset-2">
		<form action="login.action" method="post" role="form">
		<div class="form-group">
		登录
		</div>
		<div class="col-md-offset-6">
		如未注册  请<a href="register_page.action">注册</a>
		</div>
			<div class="form-group">
				<label for="username">用户名</label> <input type="text" class="form-control"
					id="username" name="username" placeholder="Enter email">
			</div>
			<div class="form-group">
				<label for="password">密码</label> <input type="text"
					class="form-control" id="password" name="password"
					placeholder="Password">
			</div>
			<button type="submit" class="btn btn-default">登录</button>
	</form>
	</div>
</body>
</html>