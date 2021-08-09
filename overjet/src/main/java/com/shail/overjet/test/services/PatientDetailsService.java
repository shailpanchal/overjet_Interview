package com.shail.overjet.test.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shail.overjet.test.dto.PatientDetails;
import com.shail.overjet.test.entity.PatientIssues;
import com.shail.overjet.test.entity.PatientVisits;
import com.shail.overjet.test.repository.PatientIssueRepository;
import com.shail.overjet.test.repository.PatientVisitsRepository;

@Service
public class PatientDetailsService {

	@Autowired
	PatientIssueRepository patientIssueRepository;

	@Autowired
	PatientVisitsRepository patientVisitsRepository;

	public void addPatientVisitDetails(PatientDetails patientDetails) {
		PatientVisits patientVisits = new PatientVisits();
		patientVisits.setVisitId(patientDetails.getVisitId());
		patientVisits.setHospitalId(patientDetails.getHospitalId());
		patientVisits.setPatientId(patientDetails.getPatientId());
		patientVisits.setDocuments(String.join(",", patientDetails.getDocuments()));

		patientVisitsRepository.save(patientVisits);
		patientIssueRepository.saveAll(getPatientIssue(patientDetails));

	}

	private List<PatientIssues> getPatientIssue(PatientDetails patientDetails) {
		List<PatientIssues> patientIssues = new ArrayList<>();

		if (CollectionUtils.isNotEmpty(patientDetails.getPatientIssues())) {
			patientDetails.getPatientIssues().forEach(issue -> {
				PatientIssues obj = new PatientIssues();
				obj.setBodyPart(issue.getBodypart());
				obj.setIssueDesc(issue.getIssueDesc());
				obj.setVisitId(patientDetails.getVisitId());
				patientIssues.add(obj);
			});

		}

		return patientIssues;

	}

}
