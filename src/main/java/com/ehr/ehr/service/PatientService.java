package com.ehr.ehr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.ehr.model.PatientRecord;
import com.ehr.ehr.repository.PatientRecordRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRecordRepository repository;

    public PatientRecord getPatientRecords(String patientId) {
        return repository.findByPatientId(patientId);
    }

    public PatientRecord updatePatientRecord(PatientRecord record) {
        return repository.save(record);
    }
}
