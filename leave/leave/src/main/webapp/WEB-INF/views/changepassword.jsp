<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<!-- <link rel="stylesheet" href="/css/login.css"> -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/scripts/login.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/login.css">
</head>
<body class="bodyStyle" style="background-color: #86878a;color:white">
 <header>
	<h1 align="center">Change Password</h1><hr/>
   <header><br/>
	
	<div id="container">
		<form action="/changepassword" method="post" 
			align="center">
			<c:if test="${not empty msg }">
		
			<p id="error">${msg}</p>
	</c:if>
			<div>
				
				<label  class="field" >Old Password<span
						class="mandatory">*</span>
				</label>
				<br/>
				<input type="password" class="value"  name="oldpassword" id="password" required="required" placeholder="Enter a Old Password" />
				<br>
				<label  class="field" > New Password<span
						class="mandatory">*</span>
				</label>
				<br/>
				<input type="password" class="value"  name="newpassword" id="password" required="required" placeholder="Enter a New Password" />
				<br>
				<label  class="field" >New Confirm Password<span
						class="mandatory">*</span>
				</label>
				<br>
				<input type="password" class="value"  name="confirmpassword" id="password" required="required" placeholder="Enter a Confirm Password" />
				<br/><br/>
				
				
				<input type="submit" value="submit" id="button1" name="login"
					class="btn btn-success"  />&nbsp;
					<input type="reset" value="Cancel" Style="background-color: red;"
						name="reset" >
			</div>
		<form>
	</div>
	

</body>
</html>