/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.doctorservice;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Istina
 */
@Service
public class DoctorService {
     @Autowired
    private DoctorRepository doctorRep; 
    
     
    public Doctor getDoctorById( int id )
    {
        Optional<Doctor> doc=doctorRep.findById(id);
        if(doc.isPresent())
        {
            return doc.get();
        }
        return null;
    }
    
    
     public void deleteDoctorById(int id)
    {
        doctorRep.deleteById(id);
    }
    
   
    public Doctor createDoctor(Doctor doc)
    {
         return doctorRep.save(doc);
    }
    
     public Doctor updateDoctorById(int id,Doctor newDoctor)
    {
        Optional<Doctor> docCol=doctorRep.findById(id);
        if(!docCol.isPresent())
        {
            return null;
        }
        Doctor doc=docCol.get();
        doc.setDoctor_name(newDoctor.getDoctor_name());
        doc.setDoctor_mobile(newDoctor.getDoctor_mobile());
        doc.setDoctor_address(newDoctor.getDoctor_address());
        doc.setEmail(newDoctor.getEmail());
        doc.setSpecialization(newDoctor.getSpecialization());
        
       return doctorRep.save(doc);
    }
     
     public List<Doctor>getAllDoctors()
     {
         return doctorRep.findAll();
     }
     
      List<Doctor>findDoctorByName(String name)
     {
           return doctorRep.findDoctorByName(name);
     }
}
