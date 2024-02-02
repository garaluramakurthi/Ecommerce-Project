package com.ravi.emart.service;

import java.util.Optional;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ravi.emart.model.CustomUserDetail;
import com.ravi.emart.model.User;
import com.ravi.emart.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

	
	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findUserByEmail(email);
		user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
		return user.map(CustomUserDetail::new ).get();
	}
	
}
