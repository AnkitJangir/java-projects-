<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#9370DB">
<div id="content" height="600px" width="600px" float="right">
<img src="travel1111.jpg" style="height:600px;width:1000px;float:right">
</div>


&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h1><i>ENTER BUS DETAILS:</i></h1>
<form action="busadd">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TYPE:<select name="type">
<option value="bus">bus</option>
<option value="car">car</option></select><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OWNER:<input type="text" name="owner" required="required"></input><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;STATUS:<select name="status">
<option value="running">running</option>
<option value="accidental">accidental</option></select><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SEAT:<input type="text" name="seat" required="required"></input><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="ok" ></input><br><br>

</form>

</body>
</html>