package com.valtech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;


@Entity
@Table(name = "survey_status")
public class SurveyStatus {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="survey_status_id")
	private Long id;
	
	@NotNull
	@Column(name="survey_status_name")
	private String statusName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public SurveyStatus(String statusName) {
		this.statusName = statusName;
	}



}
