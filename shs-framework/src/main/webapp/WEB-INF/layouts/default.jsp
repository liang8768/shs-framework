<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <sitemesh:head/>
</head>

<body>
<%@ include file="/WEB-INF/layouts/header.jsp"%>
    <sitemesh:body/>
<%@ include file="/WEB-INF/layouts/footer.jsp"%>
</body>
</html>