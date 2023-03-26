<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.List"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">
<br>${desc}<br><br>
 ${user.name}<br>
${user.email}<br>
${user.password}<br>
${user.phoneNumber}<br>
${user.gender}<br>
${user.language}<br>
${user.zipcode}<br>
${user.address.city}<br>
${user.address.country}<br>
</h1>
</body>
</html>