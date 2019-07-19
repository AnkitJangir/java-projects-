<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body bgcolor="D8BFD8">
<div id="content" height="600px" width="600px" float="right">
<img src="gh.jpg" style="height:600px;width:900px;float:right">
</div>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h1><b>UPDATE SERVICE:</b></h1><br><br>
<form action="serviceupdate">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3>enter time and type of bus whose info is to change</h3><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TIME:<input type="text" name="time" required="required"></input><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TYPE:<select name="type">
<option value="bus">bus</option>
<option value="car">car</option></select>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h1>ENTER NEW DATA</h1><br>
<!-- 
FROM:<input type="text" name="from1"></input><br>
TO:<input type="text" name="to1"></input><br>  -->

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FARE:<input type="text" name="fare1" required="required"></input><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TIME:<input type="text" name="time1" required="required"></input><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;STATUS:<select name="status1">
<option value="running">running</option>
<option value="accidental">accidental</option></select><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TYPE:<select name="type1">
<option value="bus">bus</option>
<option value="car">car</option></select>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="ok" ></input><br><br>
</form>

</body>
</html>