/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.patientservice;

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
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int patient_id;
    
    @Column(name="patient_name") 
    private String patient_name;
    
    @Column(name="patient_address") 
    private String patient_address;
    
    @Column(name="patient_mobile") 
    private int patient_mobile;
    
    @Column(name="age") 
    private int age;
      
    @Column(name="reason") 
    private String reason;

    public Patient(int patient_id, String patient_name, String patient_address, int patient_mobile, int age, String reason) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_address = patient_address;
        this.patient_mobile = patient_mobile;
        this.age = age;
        this.reason = reason;
    }
    
    public Patient() {
       
    }
    
    

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_address() {
        return patient_address;
    }

    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    public int getPatient_mobile() {
        return patient_mobile;
    }

    public void setPatient_mobile(int patient_mobile) {
        this.patient_mobile = patient_mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    
}
