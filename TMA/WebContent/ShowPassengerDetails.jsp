<!DOCTYPE html>
<%@ page language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<title>ShowPassengerDetails</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<% String array[] =new String[15]; 
array[0] = (String)request.getAttribute("p_id");
array[1] = (String)request.getAttribute("first_name");
array[2] = (String)request.getAttribute("middle_name");
array[3] = (String)request.getAttribute("surname");
array[4] = (String)request.getAttribute("address");
array[5] = (String)request.getAttribute("city");
array[6] = (String)request.getAttribute("state");
array[7] = (String)request.getAttribute("pincode");
array[8] = (String)request.getAttribute("contact_no");
array[9] = (String)request.getAttribute("email_id");
array[10] = (String)request.getAttribute("data_of_birth");
array[11] = (String)request.getAttribute("gender");


%>
<%=array[0]%>



  
</head><body>
<form method="post" name="ViewDetails"><br>
ID:&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; <input value="<%=array[0]%>" name="p_id" size="5"><br>
First Name :&nbsp;&nbsp; <input value="<%=array[1] %>" name="first_name">
Middle Name : <input value="<%=array[1] %>" name="middle_name"> Last Name:<input value="<%=array[2] %>" name="surname"><br>
Address : &nbsp;&nbsp; &nbsp;&nbsp; <textarea cols="30" rows="5" name="address"><%=array[3] %></textarea> <br>
City : &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; <input name="city" value="<%=array[4] %>"><br>
State : &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; <input value="<%=array[5] %>" name="state"><br>
Pincode&nbsp; : &nbsp;&nbsp; &nbsp;&nbsp; <input value="<%=array[6] %>" name="pincode"><br>
Contact No :&nbsp; <input value="<%=array[7] %>" name="contact_no"><br>
Email Id : &nbsp;&nbsp; &nbsp;&nbsp; <input value="<%=array[8] %>" name="email_id"><br>
DOB : &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; <input value="<%=array[9] %>" name="date_of_birth"><br>
Age :&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <input value="<%=array[10] %>" name="age" size="3"> <br>
Gender<br>
  <br>
  <br>
</form>

</body>
</html>