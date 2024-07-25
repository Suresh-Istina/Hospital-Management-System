/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appointmentservice;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Istina
 */
@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRep; 
    @Autowired ApiCall apicall;
     
    
    
     public void deleteAppointmentById(int id)
    {
        appointmentRep.deleteById(id);
    }
    
   
    public Appointment createAppointment(Appointment app)
    {
         return appointmentRep.save(app);
    }
    
     public Appointment updateAppointmentById(int id,Appointment newAppointment)
    {
        Optional<Appointment> appCol=appointmentRep.findById(id);
        if(!appCol.isPresent())
        {
            return null;
        }
        Appointment app=appCol.get();
        app.setDate(newAppointment.getDate());
        app.setTime(newAppointment.getTime());
        app.setDoctor_id(newAppointment.getDoctor_id());
        app.setPatient_id(newAppointment.getPatient_id());
        
        
       return appointmentRep.save(app);
    }
     
     public List<Appointment>getAllAppointments()
     {
         return appointmentRep.findAll();
     }
     
    
     public AppointmentDetail getById(int id) {
        Appointment app=appointmentRep.findById(id).orElse(null);
        
        Doctor doc=apicall.getDoctorDetails(app.getDoctor_id());
        AppointmentDetail ap= new AppointmentDetail();
        BeanUtils.copyProperties(app,ap);
        ap.setDoctor(doc);
       
        Patient pat=apicall.getPatientDetails(app.getPatient_id());
        BeanUtils.copyProperties(app,ap);
        ap.setPatient(pat);
        return ap;
       
            
    }
     
  
}
