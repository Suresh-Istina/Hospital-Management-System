/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.patientservice;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Istina
 */
@Service
public class PatientService {
       @Autowired
    private PatientRepository patientRep; 
    
     
    public Patient getPatientById( int id )
    {
        Optional<Patient> patient=patientRep.findById(id);
        if(patient.isPresent())
        {
            return patient.get();
        }
        return null;
    }
    
    
     public void deletePatientById(int id)
    {
        patientRep.deleteById(id);
    }
    
   
    public Patient createPatient(Patient patient)
    {
         return patientRep.save(patient);
    }
    
     public Patient updatePatientById(int id,Patient newPatient)
    {
        Optional<Patient> patientCol=patientRep.findById(id);
        if(!patientCol.isPresent())
        {
            return null;
        }
        Patient patient=patientCol.get();
        patient.setPatient_name(newPatient.getPatient_name());
        patient.setPatient_address(newPatient.getPatient_address());
        patient.setPatient_mobile(newPatient.getPatient_mobile());
        patient.setAge(newPatient.getAge());
        patient.setReason(newPatient.getReason());
        
       return patientRep.save(patient);
    }
     
     public List<Patient>getAllPatients()
     {
         return patientRep.findAll();
     }
  
}
