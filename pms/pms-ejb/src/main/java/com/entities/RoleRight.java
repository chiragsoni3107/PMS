package com.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="RoleRight")
public class RoleRight {
	private Project projectId;
	private Role roleId;
	private Right rightId;
}
