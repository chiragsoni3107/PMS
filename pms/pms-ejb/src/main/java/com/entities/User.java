package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@NotNull
	private String name;
	
	@NotNull
	private String email;
	
	@NotNull
	private String userName;
	
	@NotNull
	private String password;
	
	@NotNull
	private boolean active;
	
	@NotNull
	private String contact;
	
	@NotNull
	private Date dateOfBirth;
	
	@NotNull
	private String avatar;
	
	
}
