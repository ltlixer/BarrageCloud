#视频弹幕云

##1.简介
弹幕云将是REST风格的WEB API调用服务，REST API服务有诸多优点，这使得它越来越流行。应用于弹幕云服务中，主要有如下特点：
1.	结果表示格式丰富：API提供包括XML/JSON等多种格式的结果表示支持JavaScript调用：弹幕云支持JavaScript以JSON-P回调的方式调用API，使得返回结果可以嵌入到Web页面。
2.	请求方式多样：语言云提供了HTTP GET和HTTP POST两种方式的调用接口。
3.	用户认证简洁：使用API_KEY作为用户的统一授权方式。

##2.注册
用户先在弹幕云上注册一个帐号。相关信息审核通过后，系统会向用户的注册邮箱发送API_KEY和本月的流量额度，后者将在控制面板实时更新，便于用户进行查看。

##API参数集
参数集
<table>
   <tr>
      <td></td>
   </tr>
   <tr>
      <td>参数名</td>
      <td>含义和取值</td>
   </tr>
   <tr>
      <td>method_name</td>
      <td>调用方法：quote（引用方式）、storage（存储方式）</td>
   </tr>
</table>

quote调用
<table>
   <tr>
      <td>参数名</td>
      <td>含义和取值</td>
   </tr>
   <tr>
      <td>api_key</td>
      <td>用户注册弹幕云服务后获得的认证标识</td>
   </tr>
   <tr>
      <td>video_url</td>
      <td>视频的URL地址</td>
   </tr>
</table>

storage调用
<table>
   <tr>
      <td>参数名</td>
      <td>含义和取值</td>
   </tr>
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
      <td>barrage_content</td>
      <td>弹幕文字内容</td>
   </tr>
   <tr>
      <td>barrage_sendtime</td>
      <td>发送弹幕时的视频时间</td>
   </tr>
</table>

##4.调用
引用方式JavaScript代码<br>
uri ="http://api.eyesay.com/quote/?api_key=YourApiKey&video_url=YourVideoURL"

```javascript
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
```