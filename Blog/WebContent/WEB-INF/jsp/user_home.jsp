<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>我的博客</title>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<script type="text/javascript">
	CKEDITOR.replace('content_text');
</script>
</head>
<body>
	<nav class="navbar navbar-inverse" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">J2EE 博客</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="main.action">首页</a></li>
				<li><a href="personalHomePage.action">我的博客</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 博客管理 <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="personalArticlePage.action">我的文章</a></li>
						<li><a href="#">个人档案</a></li></li>
				<li class="divider"></li>
				<li><a href="#">退出博客</a></li>
			</ul>
			</li>
			</ul>
		</div>
	</div>
	</nav>

	个人头像
	部分文章
	浏览记录
</body>
</html>