package com.example.demo5.repo;

import com.example.demo5.model.Doctor;

import java.util.ArrayList;
import java.util.List;

public class doctorRepo {
    List<Doctor> doctors=new ArrayList<>();
    int x=1;
    public doctorRepo(){
        doctors.add(new Doctor(x++,"Doctor A","General Surgery. "));
        doctors.add(new Doctor(x++,"Doctor B","General Surgery. "));
        doctors.add(new Doctor(x++,"Doctor C","Anesthesiology."));
        doctors.add(new Doctor(x++,"Doctor D","Anesthesiology."));
        doctors.add(new Doctor(x++,"Doctor E","Pediatrics."));
        doctors.add(new Doctor(x++,"Doctor F","Pediatrics."));

    }
    public List<Doctor> findAllDoctors(){
        return doctors;
    }
    public void addDoctor(Doctor doctor){
        doctor.setId(x++);
        doctors.add(doctor);
    }
    public void updateDoctor(int id, Doctor doctor){
        doctors.set(id-1,doctor);
    }

    public boolean deleteDoctor(int id){
        return doctors.removeIf(d->d.getId()==id);
    }
}
