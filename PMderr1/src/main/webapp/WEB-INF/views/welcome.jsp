<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Welcome</title>
<link rel="stylesheet" href="css/styles.css" type="text/css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
<%
   Enumeration<String> en = request.getAttributeNames();
   while (en.hasMoreElements()){
	   String key = en.nextElement();
	   Object value = request.getAttribute(key);
	   out.println(key + "==>" + value + "<br>");
   }

%>
<hr>
	<div style="text-align:center" class="jumbotron">
		<h1>${title}</h1>
		<p>${subtitle}</p>
	</div>
</body>
</html>