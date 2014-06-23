<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%@include file="/commons/bootstrap.jsp" %>
<nav style="width: 100%;margin-top: 10px" class="navbar navbar-inverse" role="navigation">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">SHS</a>
  </div>
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li><a href="#">系统管理</a></li>
      <li><a href="#">系统管理</a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">系统管理 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="#">基本信息</a></li>
          <li><a href="#">用户管理</a></li>
          <li><a href="#">系统设置</a></li>
          <li class="divider"></li>
          <li><a href="#">XXXXXX</a></li>
          <li class="divider"></li>
          <li><a href="#">XXXXXX</a></li>
        </ul>
      </li>
    </ul>
    <!-- 搜索框 -->
    <form class="navbar-form navbar-left" role="search">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="搜索">
      </div>
      <button type="submit" class="btn btn-info">搜索</button>
    </form>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#">友情链接</a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">设置 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="#">查看信息</a></li>
          <li><a href="#">修改密码</a></li>
          <li class="divider"></li>
          <li><a href="${ctx }/login">退出登录</a></li>
        </ul>
      </li>
    </ul>
  </div><!-- /.navbar-collapse -->
</nav>	