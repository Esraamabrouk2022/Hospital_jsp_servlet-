package com.example.demo5.Servlet;

import com.example.demo5.model.Doctor;
import com.example.demo5.repo.doctorRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/updateDoctor")
public class UpdateDoctor extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String specialty = request.getParameter("specialty");

            Doctor doctor=new Doctor(id,name,specialty);
            doctorRepo doctorRepo = (doctorRepo) getServletContext().getAttribute("doctorRepo");
            doctorRepo.updateDoctor(id,doctor);

            response.sendRedirect("dashboard");
        }
    }

