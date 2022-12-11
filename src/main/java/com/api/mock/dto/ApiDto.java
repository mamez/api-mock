package com.api.mock.dto;

import javax.validation.constraints.NotBlank;

import com.api.mock.core.ValidationGroups;
import com.api.mock.type.State;

public class ApiDto {

	private Long id;

	@NotBlank(message = "Name field is required ")
	private String name;

	@NotBlank(message = "contextRoot field is required ")
	private String contextRoot;

	private String workSpace;

	@NotBlank(message = "contextRoot field is required ", groups = ValidationGroups.Put.class)
	private State state;

	private String auditDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContextRoot() {
		return contextRoot;
	}

	public void setContextRoot(String contextRoot) {
		this.contextRoot = contextRoot;
	}

	public String getWorkSpace() {
		return workSpace;
	}

	public void setWorkSpace(String workSpace) {
		this.workSpace = workSpace;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(String auditDate) {
		this.auditDate = auditDate;
	}
}
