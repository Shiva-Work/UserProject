<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="p1.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)session.getAttribute("Bean");
out.println("Welcome to "+ub.getfName()+"<br>");
%>
<jsp:include page="Link.html"/>
</body>
</html>