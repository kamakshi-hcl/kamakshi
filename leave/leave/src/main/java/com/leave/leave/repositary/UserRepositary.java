package com.leave.leave.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leave.leave.model.User;
@Repository
public interface UserRepositary extends JpaRepository<User, Integer>{
	public Optional<User> findByUserName(String userName);
	


	
	

}
