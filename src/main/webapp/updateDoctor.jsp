<%@ page import="com.example.demo5.model.Doctor" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Doctor</title>
</head>
<body>
<h2>Update Doctor</h2>
<form action="updateDoctor" method="get">
    <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
    Name: <input type="text" name="name" value="<%= request.getParameter("name") %>"><br><br>
    Specialty: <input type="text" name="specialty" value="<%= request.getParameter("specialty") %>"><br><br>
    <input type="submit" value="Update Doctor">
</form>
</body>
</html>
