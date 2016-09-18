package com.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ProjectType")
public class ProjectType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long projectTypeId;
	
	@NotNull
	private String name;
	
	private String description;
	
	@OneToMany
	private List<Project> projects;

	public long getProjectTypeId() {
		return projectTypeId;
	}

	public void setProjectTypeId(long projectTypeId) {
		this.projectTypeId = projectTypeId;
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

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}
