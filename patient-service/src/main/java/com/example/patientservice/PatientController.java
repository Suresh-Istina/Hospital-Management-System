/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.patientservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Istina
 */
@RestController
public class PatientController {
      @Autowired
    private PatientService uService;
    
    @GetMapping(path="/patients/{id}")
    public Patient getPatientById(@PathVariable int id )
    {
       return uService.getPatientById(id);
    }
    
    @DeleteMapping(path="/patients/{id}")
    public void deletePatientById(@PathVariable int id )
    {
      uService.deletePatientById(id);
    }
    
    @PostMapping(path="/patients")
    public Patient createPatient(@RequestBody Patient patient) 
    {
        return uService.createPatient(patient);
    }
    
    @PutMapping(path="/patients/{id}")
    public Patient updatePatientById(@PathVariable int id,@RequestBody Patient newPatient)
    {
       return uService.updatePatientById(id,newPatient);
    }
  
    
    @GetMapping(path="/patients")
    public List<Patient> getAllPatients()
    {
        return uService.getAllPatients();
    }
    
}
