<!DOCTYPE html>
<%@ page language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<title>ShowPassengerDetails</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<%
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_mng","root","root");
        
  //      PreparedStatement psSelectRecord=null;
        //ResultSet rsSelectRecord=null;
        String sqlSelectRecord=null;
   
        sqlSelectRecord = " select p_id,first_name,middle_name,last_name,address,city,state,pincode,contact_no,emailId, data_of_birth,age from passenger_master;";
        //psSelectRecord=conn.prepareStatement(sqlSelectRecord);
        //rsSelectRecord=psSelectRecord.executeQuery();
        
        
        Statement stmt = null; 
        
        ResultSet rs =stmt.executeQuery(sqlSelectRecord); 
        out.println(rs.getString(1));
%>


	<%
		
		out.println("<html>");
		out.println("<head>");
		out.println("<meta content=\"text/html; charset=ISO-8859-1\"");
		out.println("http-equiv=\"content-type\">");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method=\"post\" name=\"ViewDetails\"><br>");
		out.println("");

		out.println("ID:                <input value=\"P001\" name=\"p_id\" size=\"5\"><br>");
		out.println("First Name :   <input value=\"" +"sada"
				+ "\" name=\"first_name\">");
		out.println("Middle Name : <input value=\"Harshadbhai\" name=\"middle_name\"> Last Name:<input value=\"Patel\" name=\"surname\"><br>");
		//out.println("Address :       <textarea cols=\"30\" rows=\"5\" name=\"address\">");
		out.println("Address :       <textarea rows=\"5\" cols=\"30\">"
				+ "</textarea> " + "<br>");

		out.println("City :              <input name=\"city\" value=\"Ahmedabad\"><br>");
		out.println("State :             <input value=\"Gujarat\" name=\"state\"><br>");
		out.println("Pincode  :       <input value=\"380061\" name=\"pincode\"><br>");
		out.println("Contact No :  <input value=\"9909904480\" name=\"contact_no\"><br>");

		out.println("Email Id :       <input value=\"khush@gmail.com\" name=\"email_id\"><br>");
		out.println("DOB :           <input value=\"1998-06-15\" name=\"date_of_birth\"><br>");
		out.println("Age :             <input value=\"23\" name=\"age\" size=\"3\"> <br>");
		out.println("Gender<br>");

		out.println("<br>");
		out.println("<br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	%>
</body>
</html>