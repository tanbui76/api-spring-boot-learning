package com.springbootdemo.api.dto;

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
	
	
}
