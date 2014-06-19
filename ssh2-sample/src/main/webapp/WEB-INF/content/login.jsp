<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>Boyasoft CMS</title>

    <link href="${ctx}/static/bootstrap/css/bootstrap.css" rel="stylesheet">
	<script src="${ctx}/static/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script src="${ctx}/static/bootstrap/js/bootstrap.js" type="text/javascript"></script>

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
            <h1 style="margin-left:320px;">Boyasoft CMS Login</h1>
        </div>
        <div class="row">
            <div class="span16">
                <form action="${ctx}/login" method="post">
                    <fieldset id="login-form" style="margin-left:350px;">
					<div class="clearfix">
                        <label><s:text name="user.name" />：</label>
                        <div class="input">
                        	<input type="text" name="username" size="30" class="xlarge disabled"/>
                        </div>
                    </div>
                    <div class="clearfix">
                        <label><s:text name="user.password"/>：</label>
                        <div class="input">
                        	<input type="password" name="password" size="30" class="xlarge disabled"/>
                        </div>
                    </div>
                    <div class="clearfix">
                        <label>验证码：</label>
                        <div class="input">
                        	<input type="text" name="validateCode" size="30" class="xlarge disabled"/>
                        	<img src="${ctx}/system/code" onclick="changeValidateCode(this)"/>
                        </div>
                    </div>
                    <br/>
                    
                    <div class="actions">
                    	<input type="submit" class="btn btn-primary btn-large" value="Login">
                    </div>
                	</fieldset>
                </form>
        	</div>
        </div><!-- /row -->

        <br />
</div><!-- /container -->

<footer class="footer">
    <div class="container">
        <p class="pull-right">&copy; Boyasoft CMS 2012.</p>
    </div>
</footer>

</body>
</html>