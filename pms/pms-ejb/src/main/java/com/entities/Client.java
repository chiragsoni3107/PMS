package com.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Client")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long clientId;
	
	@NotNull
	private String name;
	
	private String description;
	
	@NotNull
	private Date subscriptionDate;
	
	@NotNull
	private Date registrationEndDate;
	
	@NotNull
	private String timeZone;
	
	@NotNull
	private long allowedUsers;
	
	@NotNull
	private long allowedProjects;
	
	@NotNull
	private boolean isFreeSubscription;
	
	@NotNull
	private String emailId;
	
	private String otherContactInformation;
	
	@OneToMany
	private List<Project> projectList;

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
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

	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public Date getRegistrationEndDate() {
		return registrationEndDate;
	}

	public void setRegistrationEndDate(Date registrationEndDate) {
		this.registrationEndDate = registrationEndDate;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public long getAllowedUsers() {
		return allowedUsers;
	}

	public void setAllowedUsers(long allowedUsers) {
		this.allowedUsers = allowedUsers;
	}

	public long getAllowedProjects() {
		return allowedProjects;
	}

	public void setAllowedProjects(long allowedProjects) {
		this.allowedProjects = allowedProjects;
	}

	public boolean isFreeSubscription() {
		return isFreeSubscription;
	}

	public void setFreeSubscription(boolean isFreeSubscription) {
		this.isFreeSubscription = isFreeSubscription;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getOtherContactInformation() {
		return otherContactInformation;
	}

	public void setOtherContactInformation(String otherContactInformation) {
		this.otherContactInformation = otherContactInformation;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
	
}
