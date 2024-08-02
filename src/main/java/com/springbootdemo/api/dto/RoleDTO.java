package com.springbootdemo.api.dto;

import java.util.Set;

import com.springbootdemo.api.entity.User;

public class RoleDTO {
	private String nameRole;
	
    private Set<User> users ;

	public RoleDTO(String nameRole) {
		super();
		this.nameRole = nameRole;
	}

	public RoleDTO() {
		super();
	}

	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
    
    
}
