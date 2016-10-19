<html>
<head>

<style>
	input {
    font-size: 12px;
    text-transform: uppercase;
    font-family: sans-serif;
    padding: 3px 4px;
    padding-bottom: 6px;
    margin-bottom: -10px;
    float: left;
    margin-left: 20px;
    margin-top: 4px;
    max-width: 215px;
}
	html {
  background-color: #5D62BA;
  font-family: "Tenor Sans", sans-serif;
}
	h2{
		font-family:sansation;
		color:#0FFF53;
	}
	legend {
 				   color:#0FFF53;
 				   font-size:  1.4em;
    			   font-weight:  bold;
    			   position:  relative;
    			   top:  -.1em;
			}
			div{
				font-weight: bold;
				color:turquoise;
				font-family:"Century Gothic";
			}
	
	
	table td{
		background-color:#4FA;
		border:2px solid;
		border-top-right-radius:2em;
		border-top-left-radius:2em;
		border-bottom-right-radius:2em;
		border-bottom-left-radius:2em;
	}

</style>
<meta content="text/html; charset=ISO-8859-1"
http-equiv="content-type">
<title></title>
</head>
<body>

<form>
<input type="button"  name="Signin" value="Dashboard " onclick="location.href = 'Airline.jsp';">
						

<div class="container">
			<div class="login">
				<h1 class="login-heading">
				
				<form method="post" action="Login" name="index">
					
					
					<div class="login-footer">
						
						
						<input type="button"  name="Signin" value="Choose Flights" onclick="location.href = 'viewFlights.jsp';">
						<a href="addUser.html" target="_blank" title="Click to Register">
					
					<input type="button" class="btn btn--right shift--left" name="Signin" value="Your Flights" onclick="location.href = 'searchYourFlight.jsp';"><br>
					<input type="button" class="btn btn--right shift--left" name="Signin" value="Show Passenger Details" onclick="location.href = 'SearchId.jsp';">
					</a>
					</div>
				</form>
			</div>
		</div>



<br>
</form>
</body>
</html>

