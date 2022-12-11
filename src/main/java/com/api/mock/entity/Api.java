package com.api.mock.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.api.mock.type.State;

@Entity
@Table(name = "apm_api", uniqueConstraints = {
		@UniqueConstraint(name = "api_uniq_colum_name", columnNames = { "name", "work_space" }),
		@UniqueConstraint(name = "api_uniq_context_root", columnNames = { "context_root", "work_space" }) })
public class Api implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name", length = 50, nullable = false)
	private String name;

	@Column(name = "context_root", length = 100, nullable = false)
	private String contextRoot;

	@Column(name = "work_space", length = 100, nullable = false)
	private String workSpace;

	@Column(name = "state", nullable = false)
	@Enumerated(EnumType.STRING)
	private State state;

	@Column(name = "audit_date")
	@Temporal(TemporalType.DATE)
	private Date auditDate;

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

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

}
