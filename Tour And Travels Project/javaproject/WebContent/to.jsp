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
document.form.action="too";
document.form.submit();
}
</script>

</head>
<body bgcolor="#ADD8E6">
<center>
<h1><b>ENTER</b></h1>
<form name="form">
TO:<input type="text" name="to"></input><br><br>
<input type="button" value="ok" onclick="get()"></input><br><br>
</form>
</center>
<div id="content" height="400px" width="1000px" >
<img src="mm.jpg" style="height:500px;width:1200px;margin:100px;">
</div>


</body>
</html>