package com.springbootdemo.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class LoginDTO {
	@NotNull(message = "email cannot be null")
	@Email(message = "email must valid")
	private String email;

	@NotNull(message = "password cannot be null")
	private String password;

	public LoginDTO() {
		super();
	}

	public LoginDTO(@NotNull(message = "email cannot be null") @Email(message = "email must valid") String email,
			@NotNull(message = "password cannot be null") String password) {
		super();
		this.email = email;
		this.password = password;
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
