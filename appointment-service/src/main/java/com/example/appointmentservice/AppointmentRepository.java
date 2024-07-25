/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appointmentservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Istina
 */
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{
    
}
