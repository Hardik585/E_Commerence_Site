<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New User</title>
</head>
<body>
      	
	<%@include file="Components/CommonTaskFile.jsp"%>

	<%@include file="Components/Navbar.jsp"%>
	
	<div class="container-fluid">

	<div class="row mt-5">
		<div class="col-md-4  offset-md-4">
			<div class="card ">
						
			<%@include file= "Components/Message.jsp" %>

			<h3 class="text-center mt-2">Register From </h3>
			
				<div class="card-body px-5">
					<form action="RegisterServlet" method="Post">
						<label for="user_name" class="form-label">Your Name
							address</label>
							 <input
							 name="user_name" type="text" class="form-control" id="user_name"
							placeholder="Enter Your Name Here"> 
							
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
							
							 <label
							for="user_number" class="form-label">Mobile No</label>
							 <input
							name="user_number" type="number" class="form-control" id="user_number"
							placeholder="Enter Your Mobile No. Here "> 
							
							<label
							for="user_address" class="form-label">Address </label>
						<textarea name="user_address" class="form-control" id="user_address"
							placeholder="Enter Your Address  Here " style="height: 100px"></textarea>

                          <div class="text-center mt-2">
                             <button type="submit" class="btn btn-primary">Register</button>
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