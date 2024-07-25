/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appointmentservice;

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
public class AppointmentController {
        @Autowired
    private AppointmentService uService;
    
   
    @GetMapping(path="/appointments/{id}")
    public AppointmentDetail getById(@PathVariable int id )
    {
       return uService.getById(id);
    }
    
    @DeleteMapping(path="/appointments/{id}")
    public void deleteAppointmentById(@PathVariable int id )
    {
      uService.deleteAppointmentById(id);
    }
    
    @PostMapping(path="/appointments")
    public Appointment createAppointment(@RequestBody Appointment app) 
    {
        return uService.createAppointment(app);
    }
    
    @PutMapping(path="/appointments/{id}")
    public Appointment updateAppointmentById(@PathVariable int id,@RequestBody Appointment newAppointment)
    {
       return uService.updateAppointmentById(id,newAppointment);
    }
  
    
    @GetMapping(path="/appointments")
    public List<Appointment> getAllAppointments()
    {
        return uService.getAllAppointments();
    }
   
   
}
