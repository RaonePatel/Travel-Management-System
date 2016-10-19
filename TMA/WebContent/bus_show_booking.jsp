<html>
<head>
<meta content="text/html; charset=ISO-8859-1"
http-equiv="content-type">
<title></title>
</head>
<body>
<% String arr[] =new String[15];
					arr[0] = (String)request.getAttribute("R_CODE");
					arr[1] = (String)request.getAttribute("P_ID");
					arr[2] = (String)request.getAttribute("F_CODE");
					arr[3] = (String)request.getAttribute("date_of_reservation");
					arr[4] = (String)request.getAttribute("seats_reserved");
					arr[5] = (String)request.getAttribute("class");
					arr[6] = (String)request.getAttribute("price");
					
					

 %>
<form method="post" action="bookFlight" name="bookFlight">
<table style="text-align: left; width: 479px; height: 202px;"
border="1">
<tbody>
<tr>
<td style="vertical-align: top;">&nbsp;R_CODE<br>
</td>
<td style="vertical-align: top;"><%=arr[0] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;P_ID</td>
<td style="vertical-align: top;"><%=arr[1] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;F_CODE</td>
<td style="vertical-align: top;"><%=arr[2] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;date_of_reservation</td>
<td style="vertical-align: top;"><%=arr[3] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;seats_reserved</td>
<td style="vertical-align: top;"><%=arr[4] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;class</td>
<td style="vertical-align: top;"><%=arr[5] %><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">&nbsp;price</td>
<td style="vertical-align: top;"><%=arr[6] %><br>
</td>
</tr>
</tbody>
</table>
<br>
<br>
<br>
<br>
<br>
</form>
</body>
</html>

