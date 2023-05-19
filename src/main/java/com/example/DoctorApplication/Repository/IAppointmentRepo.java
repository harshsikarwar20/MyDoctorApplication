package com.example.DoctorApplication.Repository;

import com.example.DoctorApplication.model.Appointment;
import com.example.DoctorApplication.model.AppointmentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment, AppointmentKey> {

    public String findByIdAppId(Long id);
}
