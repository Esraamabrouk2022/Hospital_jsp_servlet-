package com.example.demo5.Servlet;

import com.example.demo5.model.Patient;
import com.example.demo5.repo.patientRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.file.FileStore;

@WebServlet("/addPatient")
public class addPatient extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age= Integer.parseInt(request.getParameter("age"));
        Patient patient=new Patient(name,age);
        patientRepo patientRepo= (com.example.demo5.repo.patientRepo) getServletContext().getAttribute("patientRepo");
        patientRepo.addPAtient(patient);
        response.sendRedirect("dashboard");
    }

}
