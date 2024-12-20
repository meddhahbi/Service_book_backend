package com.example.ServiceBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ServiceBooking.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findFirstByEmail(String email);

}
