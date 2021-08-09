package com.shail.overjet.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_visits")
public class PatientVisits {

	@Id
	@Column(name = "visit_id", nullable = false, unique = true)
	private String visitId;

	@Column(name = "patient_id")
	private String patientId;

	@Column(name = "hospital_id")
	private String hospitalId;

	@Column(name = "documents")
	private String documents;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getVisitId() {
		return visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

}
