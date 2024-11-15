package com.example.ServiceBooking.Services.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ServiceBooking.Dto.SignupRequestDto;
import com.example.ServiceBooking.Dto.UserDto;
import com.example.ServiceBooking.Entity.User;
import com.example.ServiceBooking.Enums.UserRole;
import com.example.ServiceBooking.Repository.UserRepository;

@Service
public class AuthServiceImp implements AuthService {

	
	@Autowired
	UserRepository userRepo;
	
	
	public UserDto signupClient(SignupRequestDto request) {
		User user = new User();
		user.setName(request.getName());
		user.setLastname(request.getLastname());
		user.setEmail(request.getEmail());
		user.setPhone(request.getPhone());
		user.setPassword(request.getPassword());
		
		user.setRole(UserRole.CLIENT);
		
		return userRepo.save(user).getDto();
		
	}
	
	
	public UserDto signupSeller(SignupRequestDto request) {
		User user = new User();
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setPhone(request.getPhone());
		user.setPassword(request.getPassword());
		
		user.setRole(UserRole.SELLER);
		
		return userRepo.save(user).getDto();
		
	}
	
	
	public Boolean presentByEmail(String email) {
		return userRepo.findFirstByEmail(email)!=null;
	}
}
