/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.doctorservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Istina
 */
@RestController
public class DoctorController {
       @Autowired
    private DoctorService uService;
    
    @GetMapping(path="/doctors/{id}")
    public Doctor getDoctorById(@PathVariable int id )
    {
       return uService.getDoctorById(id);
    }
    
    @DeleteMapping(path="/doctors/{id}")
    public void deleteDoctorById(@PathVariable int id )
    {
      uService.deleteDoctorById(id);
    }
    
    @PostMapping(path="/doctors")
    public Doctor createDoctor(@RequestBody Doctor doc) 
    {
        return uService.createDoctor(doc);
    }
    
    @PutMapping(path="/doctors/{id}")
    public Doctor updateDoctorById(@PathVariable int id,@RequestBody Doctor newDoctor)
    {
       return uService.updateDoctorById(id,newDoctor);
    }
  
    
    @GetMapping(path="/doctors")
    public List<Doctor> getAllDoctors()
    {
        return uService.getAllDoctors();
    }
    
    /*
    @GetMapping(path="/doctors")
    List <Doctor>findDoctorByName(@RequestParam String name)
    {
        return uService.findDoctorByName(name);
    }*/
  
}
