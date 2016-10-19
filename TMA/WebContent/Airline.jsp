<html>
<head>
<meta content="text/html; charset=ISO-8859-1"
http-equiv="content-type">
<title></title>
<style type="text/css">
.hot-container p { margin-top: 10px; }
a { text-decoration: none; margin: 0 10px; }

.hot-container {
	min-height: 100px;
	margin-top: 100px;
	width: 100%;
	text-align: center;
}

a.btn {
	display: inline-block;
	color: #666;
	background-color: #eee;
	text-transform: uppercase;
	letter-spacing: 2px;
	font-size: 12px;
	padding: 10px 30px;
	border-radius: 5px;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	border: 1px solid rgba(0,0,0,0.3);
	border-bottom-width: 3px;
}

	a.btn:hover {
		background-color: #e3e3e3;
		border-color: rgba(0,0,0,0.5);
	}
	
	a.btn:active {
		background-color: #CCC;
		border-color: rgba(0,0,0,0.9);
	}

/* blue button */

a.btn.btn-blue {
	background-color: #699DB6;
	border-color: rgba(0,0,0,0.3);
	text-shadow: 0 1px 0 rgba(0,0,0,0.5);
	color: #FFF;
}

	a.btn.btn-blue:hover {
		background-color: #4F87A2;
		border-color: rgba(0,0,0,0.5);
	}
	
	a.btn.btn-blue:active {
		background-color: #3C677B;
		border-color: rgba(0,0,0,0.9);
	}

/* red button */

a.btn.btn-red {
	background-color: #E48681;
	border-color: rgba(0,0,0,0.3);
	text-shadow: 0 1px 0 rgba(0,0,0,0.5);
	color: #FFF;
}

	a.btn.btn-red:hover {
		background-color: #DA4F49;
		border-color: rgba(0,0,0,0.5);
	}
	
	a.btn.btn-red:active {
		background-color: #B32C24;
		border-color: rgba(0,0,0,0.9);
	}
</style>
</head>
<body>

<form>

<div class="hot-container">
	<p>
		<a href="Airline.jsp" class="btn">Dashboard</a>
		<a href="viewFlights.jsp" class="btn btn-blue">View Flights</a>
	</p>
	<p>
		<a href="searchYourFlight.jsp" class="btn btn-red">View your Flights</a>
		<a href="SearchId.jsp" class="btn btn-green">Show Passanger Details</a>
	</p>
</div>

</form>
</body>
</html>

