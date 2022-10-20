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
%>
<form action="update" method="post">
Addr :<input type="text" name="ad" value="<%=ub.getAddr() %>"><br>
Mlid :<input type="text" name="mid" value="<%=ub.getMailID() %>"><br>
PhNo :<input type="text" name="pn" value="<%=ub.getPhNo() %>"><br>
<input type="submit" value="Update Profile">
</form>
</body>
</html>