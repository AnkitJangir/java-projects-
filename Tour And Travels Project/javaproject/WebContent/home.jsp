<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function get2()
{

	document.form2.action="a1";
	document.form2.submit();
}
function get3()
{
	document.form2.action="form.jsp";
	document.form2.submit();
}

</script> 
</head>
<body bgcolor="#C0C0C0">
<div id="header" style="height:100px;width:auto; background-color:#000080"><h1 style="color:white"><b><marquee>TOUR AND TRAVEL</marquee></b></h1>
</div>
<div id="content"  style="; height:300px;width:580px;float:right;">
<form name="form2" >
<h1 align="center">WELCOME</h1><br>
<p align="center"> We are pleased to introduce ourselves as the leading tourist<br /><br />
transporters having a fleet of latest models of AC and N/AC <br />  <br /> luxury coaches.<br /><br /><br />
We are serving the travels agengies industries since 1983
 with<br /> <br /> many reputed travel agencies in various parts of the county.<br />
</p>


<center>
USERNAME:<input type="text" name="username" required="required"></input><br><br><br>
PASSWORD:<input type="password" name="password" required="required"></input><br><br><br>
<input type="button" value="submit" onclick="get2()"></input><br></br><br>
<input type="button" value="register" onclick="get3()"></input><br><br><br>
</center>
</form>
</div>




<div id="menu"  width="1000px" height="100px" float="left" >
<img src="toyota.jpg" height="300px" width="150px"  />
</div>

</body>
</html>
