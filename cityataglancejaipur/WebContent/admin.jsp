<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function ur(){
	document.Form1.action="commentshow";
	document.Form1.submit(); 
}
</script>

<style>
#header {
    background-color:pink;
    color:gray;
    text-align:left;
    padding:5px;
}
#nav {
    line-height:30px;
    background-color: #eeeeee;
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
    background-color:lightgreen;
    color:white;
    clear:both;
    text-align:center;
   padding:5px;	 	 
}
</style>

</head>
<body>
<form action="mainpage.jsp" name="Form1">



<div id="header">
<img src="qwer.jpg" alt="Mountain View" 
style="width:200px;height:100px;">
<center>
<h1> WELCOME ADMIN</h1>
</center>

   
<input type='submit' name='Submit' value='BACK'>
<input type="button" value="view comment" onclick="ur()">
   
</div>

<div id="nav">
</div>

<div id="section">
<center>
<br>
<br>
<a href="adminaddinfo.jsp">ADD INFORMATION</a><br></br><br>

<a href="adminupdate.jsp">UPDATE INFORMATION</a><br><br><br>
<a href="deletedetail.jsp">DELETE INFORMATION</a>

</center>

</div>

<div id="footer">
<p>global tracker</p>
</div>
</body>
</html>