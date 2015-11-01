<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<form:errors path="student.*" />
	<form action="/spring-mvc-playground/form/confirm2" method="post">
		<div>
			<label for="name">Name</label> <input type="text" name="name"></input><br />
			<label for="hobby">Hobby</label> <input type="text" name="hobby"><br />

				<label for="mobile">Mobile</label> <input type="text" name="mobile"><br />
					<label for="dob">DOB</label> <input type="text" name="dob"><br />
						<label for="skills">Skills</label> <select name="skills" multiple>
							<option name="Java Core">Java Core</option>
							<option name="Spring Core">Spring Core</option>
							<option name="Spring MVC">Spring MVC</option>
		</div>
		<div>
			<label for="country">Country</label> <input type="text"
				name="address.country"><br /> <label for="city">City</label>
				<input type="text" name="address.city"><br /> <label
					for="street">street</label> <input type="text"
					name="address.street"><br /> <label for="zipcode">ZipCode</label>
						<input type="text" name="address.zipcode"><br />
		</div>
		<div>
			</select> <br /> </input><input type="submit">Submit</input>
		</div>
	</form>
</body>
</html>