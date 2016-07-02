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
<link href="<c:url value='/resources/images/favicon.ico' />" rel="shortcut icon" type="image/x-icon" />
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
						<a href="/BrrageCloud"><img src="<c:url value='/resources/images/logo.png' />"
							class="logo" alt="" title="" /></a>
					</div>
					<nav class="navbar-collapse zui-navbar-collapse collapse"
						style="height: 0px;">
						<ul class="nav navbar-nav">
							<li><a href="/BarrageCloud/user-profile"><i class="icon-user"> </i> ${user.realname}</a></li>
							<li><a href="/BarrageCloud/logout"><i class="icon icon-off"> </i> 退出</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</header>

		<div class="main-content">


			<section>
				<article>
					<div contenteditable="false" spellcheck="false" class="example">
						<br>
						<div class="list">
							<header>
								<h3>视频弹幕云</h3>
							</header>
							<section class="items">
								<div class="item">
									<div class="item-heading">
										<h3>
											<a href="###">1. 简介</a>
										</h3>
									</div>
									<div class="item-content">
										<p>弹幕云将是REST风格的WEB API调用服务，REST API服务有诸多优点，这使得它越来越流行。应用于弹幕云服务中，主要有如下特点：</p>
										<p>&nbsp;&nbsp;&nbsp;&nbsp;1.结果表示格式丰富：API提供包括XML/JSON等多种格式的结果表示支持JavaScript调用：弹幕云支持JavaScript以JSON-P回调的方式调用API，使得返回结果可以嵌入到Web页面。
										<br/>&nbsp;&nbsp;&nbsp;&nbsp;2.请求方式多样：语言云提供了HTTP GET和HTTP POST两种方式的调用接口。
										<br/>&nbsp;&nbsp;&nbsp;&nbsp;3.用户认证简洁：使用API_KEY作为用户的统一授权方式。
										</p>
									</div>
								</div>
								<div class="item">
									<div class="item-heading">
										<h3>
											<a href="###">2. 注册</a>
										</h3>
									</div>
									<div class="item-content">
										<p>用户先在弹幕云上注册一个帐号。相关信息审核通过后，系统会向用户的注册邮箱发送API_KEY和本月的流量额度，后者将在控制面板实时更新，便于用户进行查看。</p>
									</div>
								</div>
								<div class="item">
									<div class="item-heading">
										<h3>
											<a href="###">3. API参数集</a>
										</h3>
									</div>
									<div class="item-content">
										<p>参数集</p>
										<table class="table">
											<thead>
												<tr>
													<th>参数名</th>
													<th>含义和取值</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>method_name</td>
													<td>调用方法：quote（引用方式）、storage（存储方式）</td>
												</tr>
											</tbody>
										</table>
										<p> </p>
										<p>quote调用</p>
										<table class="table">
											<thead>
												<tr>
													<th>参数名</th>
													<th>含义和取值</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>api_key</td>
													<td>用户注册弹幕云服务后获得的认证标识</td>
												</tr>
												<tr>
													<td>video_url</td>
													<td>视频的URL地址</td>
												</tr>
											</tbody>
										</table>
										<p> </p>
										<p>storage调用</p>
										<table class="table">
											<thead>
												<tr>
													<th>参数名</th>
													<th>含义和取值</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>api_key</td>
													<td>用户注册弹幕云服务后获得的认证标识</td>
												</tr>
												<tr>
													<td>type</td>
													<td>是记录弹幕，还是获取弹幕</td>
												</tr>
												<tr>
													<td>video_name</td>
													<td>视频名称</td>
												</tr>
												<tr>
													<td>barrage_user</td>
													<td>发送弹幕的用户</td>
												</tr>
												<tr>
													<td>发送弹幕的用户</td>
													<td>弹幕文字内容</td>
												</tr>
												<tr>
													<td>barrage_sendtime</td>
													<td>发送弹幕时的视频时间</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div class="item">
									<div class="item-heading">
										<h3>
											<a href="###">4. 调用</a>
										</h3>
									</div>
									<div class="item-content">
										<p>引用方式JavaScript代码<br/>uri ="http://api.eyesay.com/quote/?api_key=YourApiKey&video_url=YourVideoURL"</p>
										<pre>
$.ajax({
	type : "POST",
	async : false,
	dataType : 'jsonp',
	timeout: 1000,    
	url : uri,
	success : successCallBack,
	error : function(err) {
		console.log(err);
	}
});

// 请求成功的回调函数，
function successCallBack(d) {
$('#eyesay_video).html(d);
}			
										</pre>
									</div>
								</div>
								
							</section>
						</div>
					</div>
				</article>
			</section>


		</div>

	</div>

</body>
</html>
