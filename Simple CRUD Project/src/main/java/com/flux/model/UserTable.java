package com.flux.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class UserTable {
	
	@Id
	private int id;
	private String name;
	
	public String toString() {
		return this.id + " - " + this.name;
	}
	public int getId() {
		 return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
