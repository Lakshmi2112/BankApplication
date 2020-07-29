<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.lakshmi.web.models.Transaction" %>
<%@page import="java.util.ArrayList"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transactions</title>
</head>
<body>
	<h3>Your last five transaction details...</h3>
	<table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>Id</b></th> 
          <th><b>Sent by</b></th> 
          <th><b>Received by</b></th>
          <th><b>Amount</b></th>
          <th><b>Date time</b></th> 
         </tr> 
         
        <%ArrayList<Transaction> trans = (ArrayList<Transaction>) request.getAttribute("transaction"); 
        for(Transaction t:trans){%> 
            <tr> 
                <td><%=t.getId()%></td> 
                <td><%=t.getSentby()%></td> 
                <td><%=t.getReceivedby()%></td> 
				<td><%=t.getAmount()%></td> 
				<td><%=t.getDatetime()%></td> 
            </tr> 
            <%}%> 
        </table>  
	
	<a href="index.jsp">Go back</a>
</body>
</html>
