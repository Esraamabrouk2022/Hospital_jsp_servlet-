package com.example.demo5.Servlet;

import com.example.demo5.model.Doctor;
import com.example.demo5.model.Patient;
import com.example.demo5.repo.doctorRepo;
import com.example.demo5.repo.patientRepo;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/dashboard")
public class dashboard extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();

        doctorRepo doctorRepo = (doctorRepo) servletContext.getAttribute("doctorRepo");
        List<Doctor> doctors = doctorRepo.findAllDoctors();
        request.setAttribute("doctors", doctors);

        patientRepo patientRepo= (patientRepo) servletContext.getAttribute("patientRepo");
        List<Patient> patients=patientRepo.findAllPatient();
        request.setAttribute("patients",patients);
        request.getRequestDispatcher("dashboard.jsp").forward(request,response);

    }
}