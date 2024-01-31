<%@ page import="com.example.demo5.model.Patient" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Patient</title>
</head>
<body>
<h2>Update Patient</h2>
<form action="updatePatient" method="post">
    <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
    Name: <input type="text" name="name" value="<%= request.getParameter("name") %>"><br><br>
    Age: <input type="number" name="age" value="<%= request.getParameter("age") %>"><br><br>
    <!-- You can add more fields for additional patient information here -->
    <input type="submit" value="Update Patient">
</form>
</body>
</html>
