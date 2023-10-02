<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	HttpSession httpSession = request.getSession();
	String message =(String) httpSession.getAttribute("message");
	%>
	<div class="alert alert-success" role="alert">
		<p><%= message%></p>
	</div>

	<%
	httpSession.removeAttribute("message");
	%>


</body>
</html>