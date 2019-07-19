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
	document.form1.action="a11"
		document.form1.submit();
}
</script>

</head>
<body bgcolor="#FFFFFF">
<div id="content" height="600px" width="600px" float="right">
<img src="tour.jpg" style="height:600px;width:800px;float:right">
</div>
<h1><b>ENTER YOUR DETAIL<br><br>BEFORE LOGIN</b></h1>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h1 text-align="center"><b>FORM</b></h1>
<form name="form1">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;name:<input type="text" name="name" required="required"></input><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;password:<input type="password" name="password" required="required"></input><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;email:<input type="text" name="email" required="required"></input><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="submit" onclick="get()"><br>
</form>

</body>
</html>