package com.example.ServiceBooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServiceBooking.Dto.SignupRequestDto;
import com.example.ServiceBooking.Dto.UserDto;
import com.example.ServiceBooking.Services.auth.AuthService;

@RestController
public class AuthController {

	
	@Autowired
	private AuthService auth;
	
	
	
	
	@PostMapping("/client/signup")
	public ResponseEntity<?> signupClient(@RequestBody SignupRequestDto signupRequestDto){
		
		if(auth.presentByEmail(signupRequestDto.getEmail())) {
			return new ResponseEntity<>("Client already exist with this email !", HttpStatus.NOT_ACCEPTABLE);
		}
		
		UserDto createdUser = auth.signupClient(signupRequestDto);
		
		return new ResponseEntity<>(createdUser, HttpStatus.OK);
		
		
	}
	
	
	@PostMapping("/seller/signup")
	public ResponseEntity<?> signupSeller(@RequestBody SignupRequestDto signupRequestDto){
		
		if(auth.presentByEmail(signupRequestDto.getEmail())) {
			return new ResponseEntity<>("Seller already exist with this email !", HttpStatus.NOT_ACCEPTABLE);
		}
		
		UserDto createdUser = auth.signupSeller(signupRequestDto);
		
		return new ResponseEntity<>(createdUser, HttpStatus.OK);
		
		
	}
	
	
}
