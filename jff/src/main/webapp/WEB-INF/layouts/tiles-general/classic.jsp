<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<!-- Bootstrap v3.3.4 | jquery.min.js must be placed before bootstrap.min.js -->

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


<!-- 100% solution for bootstrap dropdown not working-->
<!-- https://stackoverflow.com/questions/22383547/bootstrap-dropdown-menu-is-not-working/22383883#22383883 -->


<title><tiles:getAsString name="title" /></title>
</head>
<body>

<div class="container">
	
	<tiles:insertAttribute name="header" />
	
	<br><br><br>
	<tiles:insertAttribute name="body"/>
	
	<br><hr><br>
	<tiles:insertAttribute name="footer"/>
	
	<br>
	
</div>
	
</body>
</html>