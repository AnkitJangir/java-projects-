<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#header {
    background-color:pink;
    color:gray;
    text-align:left;
    padding:5px;
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:500px;
    width:100px;
    float:left;
    padding:5px;	      
}
#section {
    width:350px;
    float:left;
    padding:10px;	 	 
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
   padding:5px;	 	 
}
</style>


</head>
<body>
<div id="header">
<img src="qwer.jpg" alt="Mountain View" 
style="width:200px;height:100px;">
<center>
<h1> WELCOME ADMIN(update)</h1>
</center>
</div>

<div id="nav">
</div>

<div id="section">
<form action="updateinfo">


place name:<input type="text" name="pname" required="required"><br><br><br><br>
place type:<input type="text" name="ptype" required="required"><br><br><br><br>
opening time:<input type="text" name="OT" required="required"><br><br><br><br>
closing time:<input type="text" name="CT" required="required"><br><br><br><br>
<input type="submit" name="submit" value="Submit"><br><br><br><br><br>
</form>




</div>

<div id="footer">
<p>global tracker</p>
</div>


</body>
</html>