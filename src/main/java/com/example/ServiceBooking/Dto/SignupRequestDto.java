package com.example.ServiceBooking.Dto;

import com.example.ServiceBooking.Enums.UserRole;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class SignupRequestDto {

	
	private Long id;
	private String email;
	private String password;
	private String name;
	private String lastname;
	private String phone;
}

