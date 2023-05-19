package com.example.DoctorApplication.Service;

import com.example.DoctorApplication.Repository.IAppointmentRepo;
import com.example.DoctorApplication.model.Appointment;
import com.example.DoctorApplication.model.AppointmentKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    IAppointmentRepo appointmentRepo;

    public void bookAppointment(Appointment appointment) {
        appointmentRepo.save(appointment);
    }

    public void cancelAppointment(AppointmentKey key) {
        appointmentRepo.deleteById(key);
    }
}