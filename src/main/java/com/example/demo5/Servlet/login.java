package com.example.demo5.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class login extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate the username and password (you can use a database for authentication)
        if ("admin".equals(username) && "admin".equals(password)) {

            response.sendRedirect("dashboard");
        } else {
            
            response.sendRedirect("login.jsp?error=true");
        }}
}
