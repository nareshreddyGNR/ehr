package com.ehr.ehr.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ehr.ehr.model.PatientRecord;




public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {
    PatientRecord findByPatientId(String patientId);
}