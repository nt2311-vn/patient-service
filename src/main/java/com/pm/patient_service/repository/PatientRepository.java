package com.pm.patient_service.repository;

import com.pm.patient_service.model.Patient;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** PatientRepository */
@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
}
