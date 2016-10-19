<html>
<head>
<meta content="text/html; charset=ISO-8859-1"
http-equiv="content-type">
<title></title>
</head>
<body>
<% String arr[] =new String[15];
					arr[0] = (String)request.getAttribute("T_CODE");
					arr[1] = (String)request.getAttribute("name");
					arr[2] = (String)request.getAttribute("manufacturer");
					arr[3] = (String)request.getAttribute("model");
					arr[4] = (String)request.getAttribute("origin");
					arr[5] = (String)request.getAttribute("destination");
					arr[6] = (String)request.getAttribute("start_date");
					arr[7] = (String)request.getAttribute("departure_time");
					arr[8] = (String)request.getAttribute("arrival_time");
					arr[9] = (String)request.getAttribute("stops");
					arr[10] = (String)request.getAttribute("no_of_seats");
					arr[11] = (String)request.getAttribute("services");
					arr[12] = (String)request.getAttribute("review");

 %>
<form name="shoeFlights" action="bookFlight.jsp" method="POST">
<table style="text-align: left; width: 314px; height: 310px;" border="1" >
<tbody>
<tr>
<td style="vertical-align: top;">T_Code<br>
</td>
<td style="vertical-align: top;"><%=arr[0] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Name<br>
</td>
<td style="vertical-align: top;"><%=arr[1] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;manufacturer<br>
</td>
<td style="vertical-align: top;"><%=arr[2] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;model</td>
<td style="vertical-align: top;"><%=arr[3] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;origin</td>
<td style="vertical-align: top;"><%=arr[4] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;destination</td>
<td style="vertical-align: top;"><%=arr[5] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;start_date</td>
<td style="vertical-align: top;"><%=arr[6] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;departure_time</td>
<td style="vertical-align: top;"><%=arr[7] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;arrival_time</td>
<td style="vertical-align: top;"><%=arr[8] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Stops<br>
</td>
<td style="vertical-align: top;"><%=arr[9] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;no_of_seats</td>
<td style="vertical-align: top;"><%=arr[10] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;services</td>
<td style="vertical-align: top;"><%=arr[11] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;review</td>
<td style="vertical-align: top;"><%=arr[12] %><br>
</td>
</tr>
</tbody>
</table>
<input type="Submit" value="Book Ticket">
<br>
</form>
</body>
</html>

