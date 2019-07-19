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
<bod"WebContent/mnp.html"y>
<div id="header">
<img src="qwer.jpg" alt="Mountain View" 
style="width:200px;height:100px;">
<center>
<h1> WELCOME ADMIN(add}</h1>
</center>
</div>
<div id="nav">
</div>
<div id="section">
<form action="addinfo">
<br></br>
Place Name:
<input type="text" name="pname"></input><br><br></br>
Place Type:
<input type="text" name=ptype></input><br><br></br>
Place Address:
<input type="text" name="address"></input><br><br></br>


Place Opening Time:
<input type="text" name="OT"></input><br><br></br>
Place Closing Time:
<input type="text" name="CT"></input><br><br></br>
<input type="submit" name="submit" value = "Submit"></input>"
</form>
</div>
<div id="footer">
<p>global tracker</p>
</div>
</body>
</html>