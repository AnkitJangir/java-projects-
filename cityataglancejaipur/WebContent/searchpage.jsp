<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function sout()
{
	document.Form1.action="mainpage.jsp";
	document.Form1.submit();
}
function kl()
{
	document.Form1.action="photo.jsp";
	document.Form1.submit();
}
</script>
<style>
#header {
    background-color:pink;
    color:white;
    text-align:left;
    padding:6px;
}
#nav {
    line-height:50px;
    background-color:#eeeeee;
    height:500px;
    width:300px;
    float:left;
    padding:6px;	      
    
}
#section {
    width:300px;
    float:left;
    padding:6px;	 	 
}
#footer {
    background-color:pink;
    color:white;
    clear:both;
    
   padding:5px;	 	 
}
</style>

</head>
<body>
<form action="searchofplace" name="Form1">





<div id="header">

<img src="qwer.jpg" alt="Mountain View" 
style="width:200px;height:100px;">
<center>
<h1>City at a Glance</h1>
</center>
Place Name: 
  <input type="text" name="pname" placeholder="place name"/> 
  <input type="submit" name="search" value="Search">&nbsp;&nbsp;,&nbsp;
  <input type="button" value="photogalary" onclick="kl()">&nbsp;&nbsp;,&nbsp;
              
  <input type="button" value="SignOut" onclick="sout()">
   
   
   

        
   
</div>
</form>
<div id="nav">
<br><br></br>
<a href="showhistoricallist">HISTORICAL PLACES</a><br>

<a href="showcollegelist">COLLEGES</a><br>
<a href="showmalllist">MALLS</a><br>
<a href="showhospitallist">HOSPITALS</a><br>
</div>

<div id="section">
<center>
<img src="x.jpg" alt="Mountain View" 
style="width:1000px;height:500px;">

</center>

</div>

<div id="footer">
<p>global tracker</p>
 <form action="inseartcomment">
  <pre>
Name*  : <input type="text" name="name" required="required"/><br><br>
Email ID* : <input type="email" name="emailid" required="required"/><br>
COMMENT
<input height="200px" width="400px" type="text" name="comment" required="required"><br>
<input type="submit" name="submit" value="Submit"/>
</pre>
</form>
</div>



</body>
</html>