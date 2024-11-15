package com.example.ServiceBooking.Dto;

import com.example.ServiceBooking.Enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	
	private Long id;	
	private String email;
	private String password;
	private String name;
	private String lastname;
	private String phone;
	private UserRole role;
	
	

}

