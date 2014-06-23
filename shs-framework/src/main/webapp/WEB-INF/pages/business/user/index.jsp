<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<%@ include file="/commons/taglibs.jsp" %>
<title>用户列表</title>
</head>
<body>
<div class="page-header">
  <h1>系统管理 <small>用户列表</small></h1>
</div>
<div class="col-md-offset-2 table-responsive">
  <table class="table table-hover table-bordered" style="width: 800px">
  	<tr class="success">
 	  <td align="center" width="50px">序号</td>
 	  <td align="center" width="200px">登录帐号</td>
 	  <td align="center" width="200px">登录密码</td>
 	  <td align="center" width="100px">用户名称</td>
 	  <td align="center" width="100px">用户年龄</td>
 	  <td align="center" width="150px">操作</td>
  	</tr>
	<c:forEach items="${users }" var="user" varStatus="st">
	  <tr>
	  	<td align="center">${st.count }</td>
	    <td>${user.loginId }</td>
	    <td>${user.password }</td>
	    <td>${user.name }</td>
	    <td>${user.age}</td>
	    <td align="center">
	    	<button type="button" class="btn btn-xs btn-default">编辑</button>
	    	<button id="deleteButton" type="button" class="btn btn-xs btn-default" data-toggle="modal" data-target="#delete">删除</button>
	    </td>
	  </tr>
    </c:forEach>
  </table>
</div>
<div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">提示</h4>
      </div>
      <div class="modal-body">
                      确定删除用户<span id="deleteContent"></span>吗？
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-dismiss="modal">取消</button>
        <button type="button" onclick="deleteInput();" class="btn btn-primary">确定</button>
      </div>
    </div>
  </div>
</div>
</body>
<script type="text/javascript">
	function deleteInput(){
		alert(1);
	}
</script>
</html>