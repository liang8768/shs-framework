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
            <div class="page-header" >
                <h1 >系统角色列表 <small>系统后台管理角色列表</small></h1>
            </div>

            <a class="btn btn-primary" href="${ctx}/system/role!create">创建新角色</a><br/><br/>

            <table class="table table-striped table-bordered table-condensed">
                <thead>
                <tr>
                    <th>角色ID</th>
                    <th>角色名</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
				<s:iterator value="roles">
                <tr id='${id}_${name}'>
                    <td><code class="label label-warning">${id}</code></td>
                    <td>${name}</td>
                    <td>
                        <a href="${ctx}/system/role!edit?id=${id}" title="Edit">编辑</a>
                        <a href="${ctx}/system/role!delete?id=${id}" title="Delete" class="delete">删除</a>
                    </td>
                </tr>
				</s:iterator>
                </tbody>
            </table>

        </div><!--/span-->
    </div>
</div><!--/row-->
</body>
</html>