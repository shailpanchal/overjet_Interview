package com.shail.overjet.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shail.overjet.test.dto.PatientDetails;
import com.shail.overjet.test.services.PatientDetailsService;

public class PatientController {
	
	private static final String APPLICATION_JSON = "application/json";
	private static final String PATIENTS = "/patients";
	
	@Autowired
	PatientDetailsService patientDetailsService;

	@PostMapping(value = PATIENTS, consumes = APPLICATION_JSON)
	public ResponseEntity<Void> getPatientDetails(@RequestBody PatientDetails patientDetails) {
		patientDetailsService.addPatientVisitDetails(patientDetails);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}
