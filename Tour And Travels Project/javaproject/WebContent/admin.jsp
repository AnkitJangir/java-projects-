<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function get1()
{
	document.form2.action="serviceadd.jsp";
	document.form2.submit();
}
function get2()
{
	document.form2.action="serviceupdate.jsp";
	document.form2.submit();
}
function get3()
{
	document.form2.action="caradd.jsp";
	document.form2.submit();
}
function get5()
{
	document.form2.action="busadd.jsp";
	document.form2.submit();
}
function get6()
{  
	alert("hello");
	document.form2.action="viewsuggestion";
	document.form2.submit();
}

</script>

</head>
<body background="Bus-Reservation.jpg" >
<center>
<h1  style="color:white"><b> CHOOSE ANYONE </b></h1>





<form name="form2">
<input type="button" value="service add" onclick="get1()"></input><br><br><br><br>
<input type="button" value="service update" onclick="get2()"></input><br><br><br><br>
<input type="button" value="car add" onclick="get3()"></input><br><br><br><br>
<input type="button" value="bus add" onclick="get5()"></input><br><br><br><br>
<input type="button" value="view suggestion" onclick="get6()"></input><br><br><br><br>

</form>



</center>
</body>
</html>