<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="content" height="600px" width="600px" float="right">
<img src="travel1.jpg" style="height:600px;width:800px;float:right">
</div>


<h1>CANCEL THE BOOKING </h1>
<h3>for cancellation enter the following detail correctly</h3>
<div id="menu" height="600px" width="100px">
<form action="cancelbooking" style="margin:20px;">

NAME<input type="text" name="name" required="required"></input><br><br>
PHONE NO<input type="text" name="phoneno" required="required"></input><br><br>
AGE<input type="text" name="age" required="required"></input><br><br>
EMAILID<input type="text" name="emailid" required="required"></input><br><br>
BUS NO<input type="text" name="busno" required="required"></input><br><br>
SEAT NO<input type="text" name="seatno" required="required"></input><br><br>
TO<input type="text" name="to" required="required"></input><br><br>
FROM<input type="text" name="from" required="required"></input><br><br>
<input type="submit" value="ok"></input><br><br>
</form>
</div>


</body>
</html>