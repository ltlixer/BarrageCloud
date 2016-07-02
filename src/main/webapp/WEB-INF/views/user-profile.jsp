<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>个人中心</title>
<!-- zui -->
<link href="<c:url value='/resources/zui/css/zui.min.css' />"
	rel="stylesheet">
<link href="<c:url value='/resources/zui/css/zui.theme.min.css' />"
	rel="stylesheet">
<link href="<c:url value='/resources/css/uims.theme.css' />"
	rel="stylesheet">
<!-- jQuery -->
<script src="<c:url value='/resources/jquery/jquery-3.0.0.min.js' />"></script>
<!-- ZUI Javascript组件 -->
<script src="<c:url value='/resources/zui/js/zui.min.js' />"></script>
</head>
<body>
	<div class="page-container">
		<header id="header" class="bg-primary">
			<div class="navbar navbar-inverse" id="navbar" role="banner" style="">
				<div class="container">
					<div class="navbar-header">
						<button class="navbar-toggle collapsed" type="button"
							data-toggle="collapse" data-target=".zui-navbar-collapse">
							<span class="sr-only">切换导航</span> <span class="icon-bar"></span>
							<span class="icon-bar"></span> <span class="icon-bar"></span>
						</button>
						<a href="/BarrageCloud"><img src="<c:url value='/resources/images/logo.png' />"
							class="logo" alt="" title=""></a>
					</div>
					<nav class="navbar-collapse zui-navbar-collapse collapse"
						style="height: 0px;">
						<ul class="nav navbar-nav">
							<li><a href="#"><i class="icon-user"> </i> ${user.realname}</a></li>
							<li><a href="/BarrageCloud/logout"><i class="icon icon-off"> </i> 退出</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</header>

		<div class="main-content">
			<div class="page-user-control">
				<div class="row">
					<div class="col-md-2">
						<ul class="nav nav-primary nav-stacked user-control-nav">
							<li class="nav-heading">个人中心</li>
							<li class="nav-icon active"><a href="#"><i
									class="icon-user"></i> 个人信息 <i class="icon-chevron-right"></i></a>
							</li>
							
						</ul>
					</div>
					<div class="col-md-10">
						<div class="panel">
							<div class="panel-heading">
								<strong><i class="icon-user"></i> 个人信息</strong>
							</div>
							<div class="panel-body">
								<dl class="dl-horizontal">
									<dt>账号</dt>
									<dd>${user.username}</dd>
									<dt>姓名</dt>
									<dd>${user.realname}</dd>
									<dt>邮箱</dt>
									<dd>${user.email}</dd>
									<dt>api-key</dt>
									<dd>${user.apiKey}</dd>
								</dl>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
