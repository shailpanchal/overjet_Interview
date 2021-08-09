package com.shail.overjet.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shail.overjet.test.entity.PatientVisits;

public interface PatientVisitsRepository extends JpaRepository<PatientVisits, String>{
	
	public Optional<PatientVisits> findByPatientId(String patientId);

}
