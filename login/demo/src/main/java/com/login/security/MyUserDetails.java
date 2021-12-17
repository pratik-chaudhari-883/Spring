package com.login.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.login.dao.userdao;
import com.login.entities.user;

//import embel.co.iotmeter.iotmeter.repository.UserDetailsRepository;

import java.util.ArrayList;

@Service
public class MyUserDetails implements UserDetailsService {

  @Autowired
  private userdao userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	  
    final user user1 = userRepository.findByUsername(username);   
    if (user1 == null) {
      throw new UsernameNotFoundException("User '" + username + "' not found");
    }
    return org.springframework.security.core.userdetails.User//
        .withUsername(username)//
        .password(user1.getPassword())//
        .authorities(new ArrayList<>())//
        .accountExpired(false)//
        .accountLocked(false)//
        .credentialsExpired(false)//
        .disabled(false)//
        .build();
  }  
 
}
