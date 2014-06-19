<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>Boyasoft CMS:<sitemesh:title/></title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <meta http-equiv="Cache-Control" content="no-store" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />

    <link href="${ctx}/static/bootstrap/css/bootstrap.css" rel="stylesheet">
    <script src="${ctx}/static/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script src="${ctx}/static/jquery-validation/1.9.0/jquery.validate.min.js" type="text/javascript"></script>
    <script src="${ctx}/static/jquery-validation/1.9.0/messages_cn.js" type="text/javascript"></script>
    <script src="${ctx}/static/bootstrap/js/bootstrap.js" type="text/javascript"></script>

    <style>
        body {
            padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
        }
    </style>
    <sitemesh:head/>
</head>

<body>
<%@ include file="/WEB-INF/layouts/header.jsp"%>
<div class="container-fluid">
    <sitemesh:body/>
</div><!--/.fluid-container-->
<%@ include file="/WEB-INF/layouts/footer.jsp"%>
</body>
</html>