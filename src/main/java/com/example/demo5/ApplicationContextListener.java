package com.example.demo5;


import com.example.demo5.repo.doctorRepo;
import com.example.demo5.repo.patientRepo;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ApplicationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();

        // Initialize doctorRepo
        doctorRepo doctorRepo = new doctorRepo();
        patientRepo patientRepo=new patientRepo();

        servletContext.setAttribute("doctorRepo", doctorRepo);
        servletContext.setAttribute("patientRepo",patientRepo);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Clean-up code, if any
    }
}