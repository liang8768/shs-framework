<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/commons/taglibs.jsp" %>
<%@ page trimDirectiveWhitespaces="true" %>
<html>
<head>
    <title>角色管理</title>
</head>
<body>
<div class="row-fluid">
    <div class="span2">
        <div class="well sidebar-nav">
            <ul class="nav nav-list">
                <li class="nav-header">系统管理</li>
                <li><a href="${ctx}/system/user"><i class="icon-user"></i>用户管理</a></li>
                <li class="active"><a href="${ctx}/system/role"><i class="icon-user"></i>角色管理</a></li>
                <li><a href="${ctx}/system/upload"><i class="icon-lock"></i> 文件上传</a></li>
            </ul>
        </div><!--/.well -->
    </div><!--/span-->
	<div class="span10">
		<div class="content">
			<s:actionerror />
            <s:form id="inputForm" action="/system/role!save"  method="post" cssClass="form-horizontal">
                <s:token />
                <input type="hidden" name="id" value="${role.id}"/>
                <fieldset>
                    <div class="control-group">
                        <legend>编辑角色</legend>
                    </div>

                    <div id="messageBox" class="error" style="display:none">输入有误，请先更正。</div>


                    <div class="control-group">
                        <label class="control-label" for="role.name" class="field">角色名</label>
                        <div class="controls">
                            <input type="text" class="input-xlarge" id="name" name="role.name" value="${role.name}"/>
                        </div>
                    </div>

                    <div class="form-actions">
                        <input id="submit" class="btn btn-primary" type="submit" value="提交"/>&nbsp;
                        <input id="cancel" class="btn" type="button" value="返回" onclick="history.back()"/>
                    </div>

                </fieldset>
            </s:form>
        </div><!--/span-->
    </div>
</div><!--/row-->
</body>
</html>