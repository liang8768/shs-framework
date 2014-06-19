package com.boya.ssh.entity;

import javax.persistence.Entity;

@Entity
public class Role extends IdEntity{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
