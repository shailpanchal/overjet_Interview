package com.shail.overjet.test.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issue_id", "issue_desc", "bodypart" })
public class PatientIssue {

	@JsonProperty("issue_id")
	private String issueId;
	@JsonProperty("issue_desc")
	private String issueDesc;
	@JsonProperty("bodypart")
	private String bodypart;

	@JsonProperty("issue_id")
	public String getIssueId() {
		return issueId;
	}

	@JsonProperty("issue_desc")
	public String getIssueDesc() {
		return issueDesc;
	}

	@JsonProperty("bodypart")
	public String getBodypart() {
		return bodypart;
	}

	@Override
	public String toString() {
		return "PatientIssue [issueId=" + issueId + ", issueDesc=" + issueDesc + ", bodypart=" + bodypart + "]";
	}

}
