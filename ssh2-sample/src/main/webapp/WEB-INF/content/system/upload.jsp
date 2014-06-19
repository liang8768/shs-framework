<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/commons/taglibs.jsp" %>
<html>
<head>
    <title>文件上传</title>
</head>

<body>
<div class="row-fluid">
	<div class="span2">
        <div class="well sidebar-nav">
            <ul class="nav nav-list">
                <li class="nav-header">系统管理</li>
                <li><a href="${ctx}/system/user"><i class="icon-user"></i>用户管理</a></li>
                <li><a href="${ctx}/system/role"><i class="icon-user"></i>角色管理</a></li>
                <li class="active"><a href="${ctx}/system/upload"><i class="icon-lock"></i> 文件上传</a></li>
            </ul>
        </div><!--/.well -->
    </div><!--/span-->
    
    <div class="span10">
        <div class="content">
            <div class="page-header" >
                 <h1>Fileupload sample</h1>
            </div>

		     <div class="container-fluid">
			    <div class="row-fluid">
				    <div class="span12">
					    <s:actionerror cssClass="alert alert-error"/>
						<s:fielderror cssClass="alert alert-error"/>
					    <s:form action="doUpload" method="POST" enctype="multipart/form-data">
					        <s:file name="upload" label="File"/>
					        <s:textfield name="caption" label="Caption"/>
					        <s:submit cssClass="btn btn-primary"/>
					    </s:form>
				    </div>
			    </div>
		    </div>

        </div><!--/span-->
    </div>
</div><!--/row-->
</body>
</html>

