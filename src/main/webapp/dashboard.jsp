<%@ page import="com.example.demo5.model.Patient" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.demo5.model.Doctor" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h2>Welcome to the Hospital Management System Dashboard</h2>

<div>
    <h3>Doctors:</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Specialty</th>
            <th>Actions</th> <!-- New column for actions -->
        </tr>
        <%
            // Accessing doctors attribute from the request object
            List<Doctor> doctors = (List<Doctor>) request.getAttribute("doctors");
            if (doctors != null) {
                for (Doctor doctor : doctors) {
        %>
        <tr>
            <td><%= doctor.getId() %></td>
            <td><%= doctor.getName() %></td>
            <td><%= doctor.getSpecialty() %></td> <!-- Display specialty -->
            <td>
                <a href="updateDoctor.jsp?id=<%= doctor.getId() %>&name=<%= doctor.getName() %>&specialty=<%= doctor.getSpecialty() %>">Update</a> |
                <a href="deleteDoctor?id=<%= doctor.getId() %>">Delete</a>
            </td>

        </tr>

        <%
                }
            }
        %>
    </table><br>
    <a href="addDoctor.jsp">Add Doctor</a>
</div>

<div>
    <h3>Patients:</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Actions</th>
        </tr>
        <%
            // Accessing patients attribute from the request object
            List<Patient> patients = (List<Patient>) request.getAttribute("patients");
            if (patients != null) {
                for (Patient patient : patients) {
        %>
        <tr>
            <td><%= patient.getId() %></td>
            <td><%= patient.getName() %></td>
            <td><%= patient.getAge() %></td>
            <td>
                <a href="updatePatient.jsp?id=<%= patient.getId() %>&name=<%= patient.getName() %>&age=<%= patient.getAge() %>">Update</a>
                <a href="deletePatient?id=<%= patient.getId() %>">Delete</a>
            </td>
        </tr>
        <%
                }
            }
        %>
    </table>
    <br>
    <a href="addPatient.jsp">Add Patient</a>
</div>
</body>
</html>
