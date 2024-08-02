package com.springbootdemo.api.dto;

import java.util.Set;

import com.springbootdemo.api.entity.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class UserDTO {
	
	@NotNull(message = "name cannot be null")
	private String name;
	
	@NotNull(message = "email cannot be null")
	@Email(message = "email must valid")
	private String email;
	
	@NotNull(message = "password cannot be null")
	private String password;
	
	private Set<Role> roles;
	
	public UserDTO() {}


	public UserDTO(@NotNull(message = "name cannot be null") String name,
			@NotNull(message = "email cannot be null") @Email(message = "email must valid") String email,
			@NotNull(message = "password cannot be null") String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
