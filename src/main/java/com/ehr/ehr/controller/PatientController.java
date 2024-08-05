package com.ehr.ehr.controller;

import com.ehr.ehr.model.PatientRecord;
import com.ehr.ehr.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping("/getPatientRecord")
    public PatientRecord getPatientRecord(@RequestParam String patientId) {

        return service.getPatientRecords(patientId);
    }

    @PostMapping("/updatePatientRecord")
    public PatientRecord updatePatientRecord(@RequestBody PatientRecord record) {
        return service.updatePatientRecord(record);
    }
  @GetMapping("/get")
public  String testData(){
        return "Test pass";
}


    @PostMapping("/patientRecords")

    public PatientRecord createPatientRecord(@RequestBody PatientRecord patientRecord) {


        return service.updatePatientRecord(patientRecord);
    }
}
