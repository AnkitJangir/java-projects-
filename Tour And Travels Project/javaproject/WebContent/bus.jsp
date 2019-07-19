<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>

function get()
{
document.form.action="a33";
document.form.submit();
}
</script>

</head>
<body bgcolor="#CCCCFF">
<center>
<h1><b>ENTER</b></h1><br>
<form name="form">

VEHICLE TYPE:<select name="type">
<option value="car">car</option>
<option value="bus">bus</option>
<input type="button" value="ok" onclick="get()"></input><br><br>
<div id="content" height="600px" width="600px" float="right">
<img src="travel11.jpg" style="height:600px;width:800px;float:center">
</div>

</center>
</form>

</body>
</html>