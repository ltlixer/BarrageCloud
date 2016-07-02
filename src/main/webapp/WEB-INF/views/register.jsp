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
<title>BarrageCloud</title>
<!-- zui -->
<link href="<c:url value='/resources/zui/css/zui.min.css' />"
	rel="stylesheet">
<link href="<c:url value='/resources/zui/css/zui-theme.min.css' />"
	rel="stylesheet">
<link href="<c:url value='/resources/css/uims.theme.css' />"
	rel="stylesheet">
<!-- jQuery -->
<script src="<c:url value='/resources/jquery/jquery-3.0.0.min.js' />"></script>
<!-- ZUI Javascript组件 -->
<script src="<c:url value='/resources/zui/js/zui.min.js' />"></script>
</head>
<body>
		<div class="main-content-login">
			<div class="panel panel-primary register-box">
				<div class="panel-heading">
					<h4>BarrageCloud</h4>
				</div>
				<div class="panel-body">
					<form action="/BarrageCloud/register" method="post">
						<div class="form-group">
							<label for="exampleInputEmail1">账号</label>
							<input name="username" type="text" class="form-control" id="exampleInputEmail1" placeholder="账号">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">密码</label>
							<input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="密码">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">姓名</label>
							<input name="realname" type="text" class="form-control" id="exampleInputPassword1" placeholder="密码">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">邮箱</label>
							<input name="email" type="email" class="form-control" id="exampleInputPassword1" placeholder="密码">
						</div>
						<input type="submit" class="btn btn-default" value="注册" >
						<a href="/BarrageCloud/login" class="btn">返回登录</a>
					</form>
				</div>
			</div>
		</div>


</body>
</html>
