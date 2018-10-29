<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的文章</title>
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
	<div style="width: 900px" class="col-md-offset-1">
		所有文章

		<table class="table">
			<thead>
				<tr>
					<th>标题</th>
					<th>发帖人</th>
					<th>发帖时间</th>
					<th>系统分类</th>
					<th>最近一次修改时间</th>
					<th>最近一次回复用户</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator var="element" value="userInfo.articles">
					<tr>
						<td><s:property value="#element.title" /></td>
						<td><s:property value="#element.user.username" /></td>
						<td><s:property value="#element.postArticleTime" /></td>
						<td>系统分类</td>
						<td><s:property value="#element.lastEditTime" /></td>
						<td><s:property value="#element.lastReplyUser.username" /></td>

					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
	<p />
	<p />
	<p />
	<div class="col-md-offset-5">
	<s:if test="userInfo.totalPage>1">
		<b>页：</b>
		<c:forEach var="i" begin="1" end="${userInfo.totalPage}">
			<c:choose>
				<c:when test="${param.page==null and i==1}">
					<span class="page_on">${i}</span>
				</c:when>
				<c:when test="${param.page==i}">
					<span class="page_on">${i}</span>
				</c:when>
				<c:otherwise>
					<a href="main.action?page=${i}&select=${param.select}" class="blue">${i}</a>
				</c:otherwise>

			</c:choose>
		</c:forEach>
	</s:if>
	</div>
</body>
</html>