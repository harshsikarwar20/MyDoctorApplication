package com.example.DoctorApplication.Service;

import com.example.DoctorApplication.model.AuthenticationToken;
import com.example.DoctorApplication.model.Patient;

public interface IAuthService {

    void saveToken(AuthenticationToken token);
    AuthenticationToken getToken(Patient patient);
    boolean authenticate(String userEmail, String token);


}