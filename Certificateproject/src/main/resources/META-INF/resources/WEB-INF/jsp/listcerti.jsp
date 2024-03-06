<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

<title>your certificates</title>
<body>
	<h2>hi Welcome</h2>
	<hr>
	<div class="container">
		<h1>Your Certificates are</h1>
		<br>		
		<table class="table">
		<tr>
		<th>Id</th>
		<th>course</th>
		<th>platform</th>
		</tr>
		<tbody>
		<c:forEach items="${certifi}" var="certifi">
				<tr>
				<td>${certifi.i}</td>
				<td>${certifi.name}</td>
				<td>${certifi.platform}</td>
				<td><a href="deletecertificate?i=${certifi.i}" class="btn btn-warning">DELETE ${certifi.i}</a></td>		
			</tr>
			</c:forEach>	
		</tbody>
		
		</table>
		
		<a href="addCertificate" class="btn btn-success">Add Certificate </a>
		
	 </div>
	
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>
