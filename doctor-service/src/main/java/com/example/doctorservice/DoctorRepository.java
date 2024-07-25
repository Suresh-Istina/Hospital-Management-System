/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.doctorservice;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Istina
 */
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
     @Query("select u from Doctor u where u.doctor_name LIKE ?1%")
    List<Doctor>findDoctorByName(String name);
}
