/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.doctorservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Istina
 */
@Entity
@Table(name="doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int doctor_id;
    
    @Column(name="doctor_name") 
    private String doctor_name;
    
    @Column(name="doctor_mobile") 
    private int doctor_mobile;
    
     @Column(name="doctor_address") 
    private String doctor_address;
     
    @Column(name="email") 
    private String email;
      
    @Column(name="specialization") 
    private String specialization;

    public Doctor(int doctor_id, String doctor_name, int doctor_mobile, String doctor_address, String email, String specialization) {
        this.doctor_id = doctor_id;
        this.doctor_name = doctor_name;
        this.doctor_mobile = doctor_mobile;
        this.doctor_address = doctor_address;
        this.email = email;
        this.specialization = specialization;
    }
    

    public Doctor() {
        
    }
    
    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public int getDoctor_mobile() {
        return doctor_mobile;
    }

    public void setDoctor_mobile(int doctor_mobile) {
        this.doctor_mobile = doctor_mobile;
    }

    public String getDoctor_address() {
        return doctor_address;
    }

    public void setDoctor_address(String doctor_address) {
        this.doctor_address = doctor_address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    
}
