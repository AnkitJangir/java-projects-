<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function next(){
	document.Form1.action = "registeration";
	document.Form1.submit();             // Submit the page	
}
function next1(){
	document.Form1.action = "mainpage.jsp";
	document.Form1.submit();             // Submit the page	
}
</script>
</head>
<body>
<div id="header" style="background-color: pink;height:125px;width:1350px;">
<h1 align="center" style="text-align:center; "><br />Welcome to Registration Panel
</h1>
</div><hr>
<br>
<div id="container" style="width:1350px;background-color:gray" >
<div align="right"><br>
  <img src="jai.jpg" align="right" height="536" width="837"></div>
<form name="Form1" style="height:500px;width:400px;" align="left">
<h3 align="left">Registration Details</h3>
<p align="left">Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
  <input type="text" name="name" size="40" required="required">
  </input><br>
  <br>
  Middle Name :
  <input type="text" name="middlename" size="40">
  </input>
  <br>
  <br>
  Last Name &nbsp;&nbsp;&nbsp;&nbsp;:
  <input type="text" name="lastname" size="40" required="required">
  </input>
  <br>
  <br>
  DOB &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
  <input type= "date" name="bday" size="40" required="required">
  <br>
  <br>
  E-mail &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
  <input type= "email" name="email" size="40" required="required">
  <br>
  <br>
  Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
  <input type= "password" name="pwd" size="40" required="required">
  <br>
  <br>
  Mob-No &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
  <input type= "tel" name="mob" size="40" min="10" max="16" required="required">
  <br>
  <br>
  Gender&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:
  <input type="radio" name="Gender" value="male" required="required">
  Male<br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="radio" name="Gender" value="female" required="required">
  Female </p>

  <br>
  <input type="button" value="Submit" onClick="next()">
  <input type="button" value="Cancel" onClick="next1()">
</p>
</form>
</div>
</body>
</html>