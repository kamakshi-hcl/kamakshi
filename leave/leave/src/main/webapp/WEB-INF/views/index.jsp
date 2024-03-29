<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body style="background-color: #86878a;color:white">
	<h1 align="center">User Register</h1><hr/>
	<div id="container">
		<table align="center" cellspacing="20px" cellpadding="5px">
			<form:form action="/register" modelAttribute="user" method="post">
				
				</tr>
				<form:hidden path="id" />
				<tr>
					<td><form:label path="firstName" class="field">First Name<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="firstName" class="value"
							placeholder="Enter first name" id="firstName" required="required" />
					</td>
				</tr>
				<tr>
					<td><form:label path="lastName" class="field">Last Name<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="lastName" class="value"
							placeholder="Enter last name" id="lastName" required="required" />
					</td>
				</tr>
				<tr>
					<td><form:label path="userName" class="field">User Name<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="userName" class="value"
							placeholder="Enter user name" id="userName" required="required" />
					</td>
				</tr>
				<tr>
					<td><form:label path="password" class="field">Password<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="password" class="value" type="password"
							placeholder="Enter password" id="password" required="required" />
					</td>
				</tr>
				<tr>
					<td><form:label path="email" class="field">Email<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input type="email" class="value"
							placeholder="Enter email" id="email" path="email"
							required="required" /></td>
				</tr>
				<tr>
					<td><form:label path="role" class="field">Role<span
								class="mandatory">*</span>
						</form:label></td>
					<td><form:input path="role" class="value"
							placeholder="Enter Role" id="role" required="required" />
					</td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Register" class="btn btn-success"
						name="submit" ></td>
						<td><input type="reset" value="Cancel" Style="background-color: red;"
						name="reset" ></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>