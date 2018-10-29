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
<form action="post_article.action" method="post" role="form">
<div class="form-group">
    <label for="name">标题</label>
    <input type="text" class="form-control" id="name" placeholder="请输入标题">
  </div>
<div class="form-group">
    <label for="name">博文内容</label>
    <input type="text" class="form-control" id="content_text" placeholder="请输入博文内容">
  </div>
</form>
</body>
</html>