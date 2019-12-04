package com.valtech.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "farmer_survey_request")
public class FarmerSurveyRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "survey_request_id")
	private Long id;

	@NotNull
	private String name;
	
	private String hobli;
	
	private String village;
	
	private String district;
	
	private String state;
	
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

	public String getHobli() {
		return hobli;
	}

	public void setHobli(String hobli) {
		this.hobli = hobli;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAckNo() {
		return ackNo;
	}

	public void setAckNo(String ackNo) {
		this.ackNo = ackNo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public int getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(int assignedTo) {
		this.assignedTo = assignedTo;
	}

	public int getAssigned_by() {
		return assigned_by;
	}

	public void setAssigned_by(int assigned_by) {
		this.assigned_by = assigned_by;
	}

	private String mobile;

	@NotNull
	@Column(name = "ack_no")
	private String ackNo;
	
	@NotNull
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "status_id")
	private int statusId;
	
	@Column(name = "date_created")
	private Date dateCreated;

	@Column(name = "date_completed")
	private Date dateCompleted;

	@Column(name = "assigned_to")
	private int assignedTo;

	@Column(name = "assigned_by")
	private int assigned_by;

}
