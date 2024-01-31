package com.example.demo5.Servlet;

import com.example.demo5.repo.patientRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/deletePatient")
public class deletePatient extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        patientRepo patientRepo= (patientRepo) getServletContext().getAttribute("patientRepo");
        patientRepo.deletePatient(id);

        response.sendRedirect("dashboard");
    }

}
