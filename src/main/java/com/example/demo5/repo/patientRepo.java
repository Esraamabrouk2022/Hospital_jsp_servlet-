package com.example.demo5.repo;

import com.example.demo5.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class patientRepo {
    List<Patient> patients=new ArrayList<>();
    int x=1;
    public patientRepo(){
        patients.add(new Patient(x++,"patient A",10));
        patients.add(new Patient(x++,"patient B",26));
        patients.add(new Patient(x++,"patient C",15));
        patients.add(new Patient(x++,"patient D",21));
        patients.add(new Patient(x++,"patient E",40));
        patients.add(new Patient(x++,"patient F",14));
    }
    public List<Patient> findAllPatient(){
        return patients;
    }
    public void addPAtient(Patient patient){
        patient.setId(x++);
        patients.add(patient);
    }
    public void updatePatient(int id,Patient patient){
        patients.set(id-1,patient);
    }
    public boolean deletePatient(int id){
        return patients.removeIf(p->p.getId()==id);
    }
}
