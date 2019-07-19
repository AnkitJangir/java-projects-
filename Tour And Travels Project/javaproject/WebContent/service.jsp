<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function get()
{
	document.form.action="serviceaa";
	document.form.submit();
}
</script>

</head>
<body bgcolor="#D2B48C">
<center>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>ENTER</b><br><br><br>
<form name="form">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FROM:<input type="text" name="to" required="required"></input><br><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TO:<input type="text" name="from" required="required"></input><br><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TYPE:<select name="type">
<option value="car" name="type">car</option>
<option value="bus" name="type">bus</option>
</select><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="ok" onclick="get()"></input>
</form>
</center>
<div id="content" height="400px" width="1000px" >
<img src="aa.jpg" style="height:700px;width:1200px;margin:100px;">
</div>

</body>
</html>