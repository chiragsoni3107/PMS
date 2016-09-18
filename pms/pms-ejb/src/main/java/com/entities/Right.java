package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Right")
public class Right {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long rightId;
	
	@NotNull
	private String name;
	
	@NotNull
	private String displayName;
	
	private String description;
}
