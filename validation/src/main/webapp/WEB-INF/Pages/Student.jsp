<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Validation Form</title>
<script type="text/javascript">
function validateForm(){
	var x=document.forms["student"]["name"].value
	if(x=="")
	{
		alert("name must be filled");
		return false;
		
	}
}
</script>
</head>
<body>
<form name="student" action="Student" method="post" onsubmit="return validateForm()"> 
id:<br>
<input type="text" name="id"><br>
name:<br>
<input type="text" name="name"><br>
rollNumber:<br>
<input type="text"name="rollNumber" required> <br>

Submit:<br>
<input type="submit" name="submit">


</form>

</body>
</html>