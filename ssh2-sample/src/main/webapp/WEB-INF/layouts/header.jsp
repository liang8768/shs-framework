<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>

            <a class="brand" href="#">Boyasoft CMS</a>

            <div class="nav-collapse">
                <ul class="nav pills">
                    <li <%=request.getRequestURI().indexOf("index")>0?"class=\"active\"":""%>><a href="${ctx}/index" title="Home Page">首页</a></li>
                    <li <%=request.getRequestURI().indexOf("system")>0?"class=\"active\"":""%>><a href="${ctx}/system/user" title="系统管理">系统管理</a></li>
                    <li <%=request.getRequestURI().indexOf("data")>0?"class=\"active\"":""%>><a href="${ctx}/data/shop/" title="数据管理">数据管理</a></li>
                    <li <%=request.getRequestURI().indexOf("crawl")>0?"class=\"active\"":""%>><a href="${ctx}/crawl/manual/" title="采集管理">采集管理</a></li>
                </ul>

                <!---start right toolbar-->
                <ul class="nav pull-right">
                    <li>
                        <a href="#">当前登录：<shiro:principal property="name"/></a>
                    </li>
                    <li class="dropdown ">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" >
                            <!--Setting-->
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="${ctx}/system/manager/edit/<shiro:principal property="id"/>" title="账户设置"><i class="icon-user"></i>&nbsp;账户设置</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="${ctx}/logout"><i class="icon-off"></i>&nbsp;退出</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <!---end right toolbar-->

            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>