/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appointmentservice;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Istina
 */
@Service
public class ApiCall {
    @Autowired RestTemplate restTemplate;
    private static final String doctorMicroServiceBaseURL="http://doctor-service";
    private static final String patientMicroServiceBaseURL="http://patient-service";
    
    @CircuitBreaker(name="doc_cb",fallbackMethod="doc_fallback")
    public Doctor getDoctorDetails(int doctor_id)
    {
        Doctor doctor = restTemplate.getForObject(
                             doctorMicroServiceBaseURL+"/doctors/{doctor_id}",
                             Doctor.class,doctor_id);
        return doctor;
    }
    
    @CircuitBreaker(name="patient_cb",fallbackMethod="patient_fallback")
    public Patient getPatientDetails(int patient_id)
    {
        Patient patient = restTemplate.getForObject(
                             patientMicroServiceBaseURL+"/patients/{patient_id}",
                             Patient.class,patient_id);
        return patient;
    }
    
    public Doctor doc_fallback(Exception ex)
    {
        Doctor doctor = new Doctor();
        doctor.setDoctor_id(111);
        doctor.setDoctor_name("--doctor--");
        return doctor;
    }
    
    public Patient patient_fallback(Exception ex)
    {
        Patient patient = new Patient();
        patient.setPatient_id(111);
        patient.setPatient_name("--patient--");
        return patient;
    }
}
