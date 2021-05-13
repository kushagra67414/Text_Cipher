<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> The Encrypted Details </h2>
First Name: <%=session.getAttribute("fname") %></br>
Last Name:  <%=session.getAttribute("lname") %></br>
SAP ID:     <%=session.getAttribute("sap") %></br>
Course:     <%=session.getAttribute("course") %>
</body>
</html>