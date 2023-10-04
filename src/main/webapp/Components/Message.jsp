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
	if(message != null){
	%>
	<!-- <div class="alert alert-success" role="alert">  -->
	<div class="alert alert-warning alert-dismissible fade show" role="alert"">
		<p><%= message%></p>
		<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close">
		</button>
	</div>

	<%
	}
	httpSession.removeAttribute("message");
	%>


</body>
</html>