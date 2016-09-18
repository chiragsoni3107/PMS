package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long projectId;
	
	private String name;
	
	private String description;
	
	private Date startDate;
	
	private Date endDate;
	
	private long totalPlannedReleases;
	
	private String peojectKey;
	
	private String avatar;
	
	@OneToOne
	private ProjectType projectTypeId;

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getTotalPlannedReleases() {
		return totalPlannedReleases;
	}

	public void setTotalPlannedReleases(long totalPlannedReleases) {
		this.totalPlannedReleases = totalPlannedReleases;
	}

	public String getPeojectKey() {
		return peojectKey;
	}

	public void setPeojectKey(String peojectKey) {
		this.peojectKey = peojectKey;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public ProjectType getProjectTypeId() {
		return projectTypeId;
	}

	public void setProjectTypeId(ProjectType projectTypeId) {
		this.projectTypeId = projectTypeId;
	}
	
	
}
