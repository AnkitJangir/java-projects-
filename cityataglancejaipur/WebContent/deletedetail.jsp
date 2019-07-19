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
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
   padding:5px;	 	 
}


</style>
</head>


bod"WebContent/mnp.html"y>
<div id="header">
<img src="qwer.jpg" alt="Mountain View" 
style="width:200px;height:100px;">
<center>
<h1> WELCOME ADMIN(delete}</h1>
</center>
</div>

<div id="nav">
</div>

<div id="section">
<form action="deleteinfo">
Place Name:<br></br>
<select name="pname" >


<option value="hawa mahal">hawa mahal</option>
<option value="jantar mantar">jantar mantar</option>
<option value="hanuman mandir">hanuman mandir</option>
<option value="Crystal court">Crystal court</option>
<option value="krashna temple">krashna temple</option>
<option value="aaa">aaa</option>
<option value="Monkey temple">Monkey temple</option>
</select>
<input type="submit" name="submit" value = "Submit"></input>"

</form>


</div>

<div id="footer">
<p>global tracker</p>
</div>


</body>
</html>