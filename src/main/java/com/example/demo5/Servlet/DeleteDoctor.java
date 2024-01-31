package com.example.demo5.Servlet;

import com.example.demo5.repo.doctorRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/deleteDoctor")
public class DeleteDoctor extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the doctor ID from the request parameter
        int doctorId = Integer.parseInt(request.getParameter("id"));

        doctorRepo doctorRepo = (doctorRepo) getServletContext().getAttribute("doctorRepo");
        doctorRepo.deleteDoctor(doctorId);
        response.sendRedirect("dashboard");
    }
}
