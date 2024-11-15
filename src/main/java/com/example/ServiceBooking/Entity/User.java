package com.example.ServiceBooking.Entity;

import com.example.ServiceBooking.Dto.UserDto;
import com.example.ServiceBooking.Enums.UserRole;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	private String password;
	private String name;
	private String lastname;
	private String phone;
	private UserRole role;
	
	public UserDto getDto() {
		UserDto user = new UserDto();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setRole(role);
		return user;
	}
}
