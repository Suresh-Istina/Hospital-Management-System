/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appointmentservice;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
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
@Table(name="appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int app_id;
    
    @JsonFormat(pattern="yyyy-MM-dd", shape=Shape.STRING)
    @Column(name="date") 
    private String date;
    
    @Column(name="time") 
    private String time;
    
    @Column(name="doctor_id") 
    private int doctor_id;
    
    @Column(name="patient_id") 
    private int patient_id;

    public Appointment(int app_id, String date, String time, int doctor_id, int patient_id) {
        this.app_id = app_id;
        this.date = date;
        this.time = time;
        this.doctor_id = doctor_id;
        this.patient_id = patient_id;
    }

     public Appointment() {
       
    }

    
    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }
    
    
}
