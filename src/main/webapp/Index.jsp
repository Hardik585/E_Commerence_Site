
<%@page import="com.helperClass.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="Components/CommonTaskFile.jsp"%>
	
     <%@include file="Components/Navbar.jsp" %>
	<h1>Factory Provider Include Hello</h1>


	<%
	out.print(FactoryProvider.getFactory());
	%>

</body>
</html>