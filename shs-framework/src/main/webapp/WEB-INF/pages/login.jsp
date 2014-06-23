<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<%@ include file="/commons/taglibs.jsp" %>
<head>
    <title>SHS FRAMEWORK</title>
    <link href="${ctx}/resources/bootstrap/css/bootstrap.css" rel="stylesheet">
	<script src="${ctx}/resources/jquery/jquery-1.7.2.js" type="text/javascript"></script>
    <script src="${ctx}/resources/bootstrap/js/bootstrap.js" type="text/javascript"></script>

    <style>
        body {
            padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
        }
    </style>
    <script type="text/javascript">
    function changeValidateCode(obj) {
        //获取当前的时间作为参数，无具体意义
        var timenow = new Date().getTime();
        //每次请求需要一个不同的参数，否则可能会返回同样的验证码
        //这和浏览器的缓存机制有关系，也可以把页面设置为不缓存，这样就不用这个参数了。
        obj.src="${ctx}/system/code?d="+timenow;
    }
    </script>
</head>
<body>
<div class="container">
  <div class="page-header">
    <h1 style="margin-left:320px;">SHS FRAMEWORK Login</h1>
  </div>
  <form action="">
  <div class="form-group row">
    <div class="col-sm-3">
    </div>
    <label class="col-sm-2 control-label" for="usernameInput">
    	<h4>用户名：</h4>
    </label>
    <div class="col-sm-7">
    	<input style="width: 200px" type="text" class="form-control" id="usernameInput" placeholder="请输入用户名">
    </div>
  </div>
  <div class="form-group row">
    <div class="col-sm-3">
    </div>
    <label class="col-sm-2 control-label" for="passwordInput">
    	<h4>密码：</h4>
    </label>
    <div class="col-sm-7">
    	<input style="width: 200px" type="password" class="form-control" id="passwordInput" placeholder="请输入密码">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-4 col-sm-6">
      <button onclick="login();" type="button" class="btn btn-primary">登录</button>
    </div>
  </div>
</form>
</div>
<footer class="footer">
    <div class="container">
        <p class="pull-right">&copy; SHS FRAMEWORK 2014-2xxx.</p>
    </div>
</footer>
</body>
<script type="text/javascript">
  function login(){
	  window.location.href="${ctx}/main"
  }	
</script>
</html>