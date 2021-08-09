package com.shail.overjet.test.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "patient_id", "hospital_id", "visit_id", "documents", "patient_issues" })
public class PatientDetails {
	
	@NotBlank
	@JsonProperty("patient_id")
	private String patientId;
	@JsonProperty("hospital_id")
	private String hospitalId;
	@JsonProperty("visit_id")
	private String visitId;
	@JsonProperty("documents")
	private List<String> documents;
	@JsonProperty("patient_issues")
	private List<PatientIssue> patientIssues;

	
	@JsonProperty("patient_id")
	public String getPatientId() {
		return patientId;
	}

	@JsonProperty("patient_id")
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	@JsonProperty("hospital_id")
	public String getHospitalId() {
		return hospitalId;
	}

	@JsonProperty("hospital_id")
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	@JsonProperty("visit_id")
	public String getVisitId() {
		return visitId;
	}

	@JsonProperty("visit_id")
	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	@JsonProperty("documents")
	public List<String> getDocuments() {
		return documents;
	}

	@JsonProperty("documents")
	public void setDocuments(List<String> documents) {
		this.documents = documents;
	}

	@JsonProperty("patient_issues")
	public List<PatientIssue> getPatientIssues() {
		return patientIssues;
	}

	@JsonProperty("patient_issues")
	public void setPatientIssues(List<PatientIssue> patientIssues) {
		this.patientIssues = patientIssues;
	}

	@Override
	public String toString() {
		return "PatientDetails [patientId=" + patientId + ", hospitalId=" + hospitalId + ", visitId=" + visitId
				+ ", documents=" + documents + ", patientIssues=" + patientIssues + "]";
	}

}