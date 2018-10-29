<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发帖页面</title>
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

	<div style="width: 700px" class="col-md-offset-2">
		<form action="post_article.action" method="post" role="form">
			<div class="form-group">
				<label for="name">标题</label> <input type="text" class="form-control"
					id="name" name="title" placeholder="请输入标题">
			</div>
			<div class="form-group">
				<label for="name">系统分类</label> <input type="text"
					class="form-control" id="content_systemCatagory"
					placeholder="请输入系统分类">
			</div>
			<div class="form-group">
				<label for="name">个人分类</label> <input type="text"
					class="form-control" id="content_personalCatagory"
					placeholder="请输入个人分类">
			</div>
			<div class="form-group">
				<label for="name">博文内容</label>
				<textarea class="ckeditor" rows="3" id="content_text" name="content"></textarea>
			</div>
	<input type="submit" value="提交" />
	</form>
	</div>
</body>
</html>