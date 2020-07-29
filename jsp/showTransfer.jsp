<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.lakshmi.web.models.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer</title>
</head>
<body>
<%	
	Customer customer = (Customer)request.getAttribute("customer");
	if(customer != null) {
	float balance = customer.getAmount();	
%>
<h3>Your transfer of Rs. <%= request.getParameter("amt")%> is successful</h3>
<h4>Current balance: Rs. <%= balance %></h4>
<%} else { %>
<h3>Your transfer of Rs. <%= request.getParameter("amt")%> has failed</h3>
<%} %>

<a href="index.jsp">Go back</a>
</body>
</html>
