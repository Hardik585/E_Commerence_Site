<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login- MyZone</title>

<%@include file="Components/CommonTaskFile.jsp"%>

</head>
<body>



	<%@include file="Components/Navbar.jsp"%>

  <div class="container-fluid">

	<div class="row mt-5">
		<div class="col-md-4  offset-md-4">
			<div class="card ">
						
			<%@include file= "Components/Message.jsp" %>

			<h3 class="text-center mt-2">Login Page </h3>
			
				<div class="card-body px-5">
					<form action="LoginServlet" method="Post">							
							<label
							for="user_email" class="form-label">Email address</label>
							 <input
						 name="user_email" type="email" class="form-control" id="user_email"
							placeholder="Enter Your Email Here ">
							
						<div id="emailHelp" class="form-text">We'll never share your
							email with anyone else.</div>

						<label for="user_password" class="form-label">Password</label>
						 <input
						name="user_password"	type="password" class="form-control" id="user_password"
							placeholder="Enter Your Password Here ">
							
							<a href="Register.jsp" class="text-center d-block mb-3 mt-3">If not Register Click Here </a>
							
                          <div class="text-center mt-2">
                             <button type="submit" class="btn btn-primary">Login</button>
                             <button type="reset" class="btn btn-warning">Reset</button>
                          </div>

					</form>

				</div>
			</div>
		</div>
	</div>
</div>
  


</body>
</html>