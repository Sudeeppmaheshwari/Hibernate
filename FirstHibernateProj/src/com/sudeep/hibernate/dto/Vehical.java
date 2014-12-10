package com.sudeep.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@Entity
public class Vehical {
	@Id
	@GeneratedValue
	private int vehicalId;
	private String vehicalName;
	@ManyToMany(mappedBy="vehicals")
	private Collection<UserDetails> users = new ArrayList<UserDetails>();

	public Collection<UserDetails> getUsers() {
		return users;
	}

	public void setUsers(Collection<UserDetails> users) {
		this.users = users;
	}

	public int getVehicalId() {
		return vehicalId;
	}

	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}

	public String getVehicalName() {
		return vehicalName;
	}

	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}

}
