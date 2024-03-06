<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<html>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

<title>your certificates</title>
<body>
	<h2> Welcome  </h2>
	<hr>
	<div class="container">
		<h1>Please add Your Certificates : </h1>

		<form method="POST">
			<input type="text" name="name" placeholder=" Enter Certifcate or course name" required="required"/>
			<input type="text" name="platform" placeholder="Enter platform" required="required"/>			
				<input type="submit" class="btn btn-success"/>
		</form>
		
	 </div>
	
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>
