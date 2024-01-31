package com.example.demo5.Servlet;

import com.example.demo5.model.Patient;
import com.example.demo5.repo.patientRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/updatePatient")
public class updatePatient extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        Patient patient=new Patient(id,name,age);
        patientRepo patientRepo= (patientRepo) getServletContext().getAttribute("patientRepo");
        patientRepo.updatePatient(id,patient);

        response.sendRedirect("dashboard");
    }
}
