package com.shail.overjet.test.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shail.overjet.test.dto.PatientDetails;
import com.shail.overjet.test.services.PatientDetailsService;

@RestController
public class PatientController {
	
	private static final String APPLICATION_JSON = "application/json";
	private static final String PATIENT_WITH_EVICTION_FROM_CACHE_PATIENT_ID = "/patient-with-eviction-from-cache/{patientId}";
	private static final String PATIENT_FROM_CACHE_PATIENT_ID = "/patient-from-cache/{patientId}";
	private static final String PATIENTS = "/patients";
	
	@Autowired
	PatientDetailsService patientDetailsService;

	@PostMapping(value = PATIENTS, consumes = APPLICATION_JSON)
	public ResponseEntity<Void> getPatientDetails(@RequestBody PatientDetails patientDetails) {
		patientDetailsService.addPatientVisitDetails(patientDetails);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = PATIENT_FROM_CACHE_PATIENT_ID, produces = APPLICATION_JSON)
	public ResponseEntity<List<String>> getPatientDocumentsFromCache(@PathVariable String patientId) {
		Optional<List<String>> documents = patientDetailsService.getPatientDocuments(patientId, false);
		return new ResponseEntity<>(documents.orElse(Collections.emptyList()),
				documents.isPresent() ? HttpStatus.OK : HttpStatus.NO_CONTENT);
	}

	@GetMapping(value = PATIENT_WITH_EVICTION_FROM_CACHE_PATIENT_ID, produces = APPLICATION_JSON)
	public ResponseEntity<List<String>> getPatientDocuments(@PathVariable String patientId) {
		Optional<List<String>> documents = patientDetailsService.getPatientDocuments(patientId, true);
		return new ResponseEntity<>(documents.orElse(Collections.emptyList()), HttpStatus.OK);
	}
}
