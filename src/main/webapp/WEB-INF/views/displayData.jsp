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
<h1>Displaying data using Model MVC</h1>
<h2>User Name : ${name}

<%-- :<%=request.getAttribute("name") %> --%><br>
Spring MVC Version :<%=request.getAttribute("version") %><br>
</h2>
<% List<String> li=(List<String>)request.getAttribute("f");%>
<h3>
<% for(String s:li){out.print(s);%><br><%} %>

<c:forEach var="item" items="${f}">
<h2>${item}</h2>
<h3><c:out value="item using C:out ${item}"></c:out></h3>
</c:forEach>
</h3>
</body>
</html>