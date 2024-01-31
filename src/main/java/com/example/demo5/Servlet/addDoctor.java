package com.example.demo5.Servlet;

import com.example.demo5.model.Doctor;
import com.example.demo5.repo.doctorRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/addDoctor")
public class addDoctor extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String specialty=request.getParameter("specialty");

        Doctor newDoctor = new Doctor(name,specialty);

        doctorRepo doctorRepo = (doctorRepo) getServletContext().getAttribute("doctorRepo");
        doctorRepo.addDoctor(newDoctor);

        // Redirect back to the dashboard after adding the doctor
        response.sendRedirect("dashboard");
    }
}
