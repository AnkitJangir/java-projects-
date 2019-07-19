<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function it1()
{
	document.form1.action="bus.jsp";

		document.form1.submit();
}
function it2()
{
	document.form1.action="to.jsp";

		document.form1.submit();
}
function it3()
{
	document.form1.action="from.jsp";

		document.form1.submit();
}
function it4()
{
	document.form1.action="service.jsp";

		document.form1.submit();
}
function it5()
{
	document.form1.action="car.jsp";

		document.form1.submit();
}
function it6()
{
	document.form1.action="seatstatus";

		document.form1.submit();
}
function it7()
{
	document.form1.action="booking.jsp";

		document.form1.submit();
}
function it5()
{
	document.form1.action="suggestion.jsp";

		document.form1.submit();
}
function it8()
{
	document.form1.action="schedule";

		document.form1.submit();
}
function it9()
{
	document.form1.action="cancelbooking.jsp";

		document.form1.submit();
}


</script>

</head>
<body >
<div id="content" height="600px" width="600px" float="right">
<img src="h.jpg" style="height:600px;width:900px;float:right">
</div>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h1><b>SEARCH BY:</b></h1><br>
<form name="form1" margin="50px">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="VEHICLE TYPE" onclick="it1()"></input><br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="TO" onclick="it2()"></input><br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="FROM" onclick="it3()"></input><br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="SERVICE" onclick="it4()"></input><br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="SEAT STATUS" onclick="it6()"></input><br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="SCHEDULE" onclick="it8()" ></input><br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="BOOKING" onclick="it7()"></input><br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="SUGGESTATION" onclick="it5()" ></input><br></br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="CANCEL BOOKING" onclick="it9()" ></input><br></br>
</form>

</body>
</html>