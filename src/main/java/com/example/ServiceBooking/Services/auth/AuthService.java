package com.example.ServiceBooking.Services.auth;

import com.example.ServiceBooking.Dto.SignupRequestDto;
import com.example.ServiceBooking.Dto.UserDto;

public interface AuthService {

	
	UserDto signupClient(SignupRequestDto request);
}
