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
document.form.action="from";
document.form.submit();
}
</script>

</head>
<body bgcolor="#CCCCFF">
<center>
<h1><b>ENTER</b></h1>
<form name="form">

FROM:<input type="text" name="from" required="required"></input><br><br><br>
<input type="button" value="ok" onclick="get()"></input><br><br><br>
</form>
</center>
<div id="content" height="600px" width="600px" float="right">
<img src="f.jpg" style="height:600px;width:1500px;float:center">
</div>

</body>
</html>