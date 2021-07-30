<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<div align ="center">
<h2>Employee Registration Form</h2>

<form action ="<%=request.getContextPath() %>/register" method= "post">
	<table style= "width:80%">
		<tr>
		<td>FirstName</td>
		<td><input type="text" placeholder ="Enter first name" name = "firstname"></td>
		</tr>
		<tr>
		<td>LastName</td>
		<td><input type ="text" placeholder ="Enter last name" name = "lastname"></td>
		</tr>
		<tr>
		<td>UserName</td>
		<td><input type="text" placeholder ="Enter User name" name = "username"></td>
		</tr>
		<tr>
		<td>Password</td>
		<td><input type="password" placeholder ="Enter password" name = "password"></td>
		</tr>
		<tr>
		<td>Address</td>
		<td><input type="text" placeholder ="Enter address" name = "address"></td>
		</tr>
		<tr>
		<td>Contact</td>
		<td><input type="text" placeholder ="Enter contact" name = "contact"></td>
		</tr>
	</table>
	<input type="submit" value="submit">
</form>
</div>
</body>
</html> 