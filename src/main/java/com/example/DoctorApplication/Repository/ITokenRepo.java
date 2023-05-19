package com.example.DoctorApplication.Repository;

import com.example.DoctorApplication.model.AuthenticationToken;
import com.example.DoctorApplication.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Patient patient);

    AuthenticationToken findFirstByToken(String token);
}
