<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Displaying data using ModelAndView</h2>
<h3><% String uname=(String)request.getAttribute("name"); %>
User Name: <%=uname %>
</h3>
<% List<String> li=(List<String>)request.getAttribute("data"); %>
<h4 style="color: blue;"><%for(String v:li){out.print(v+"<br>");} %></h4>
</body>
</html>