package com.example.demo.jwt;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;

import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User not exists by Username"));

		 List<String> stringList = new ArrayList<>();

        // Add elements to the list
        stringList.add("ADMIN");
		
		Set<GrantedAuthority> authorities = 
				stringList.stream().map((role) -> new SimpleGrantedAuthority(role)).collect(Collectors.toSet());

		return new org.springframework.security.core.userdetails.User(username, user.getPassword(), authorities);
	}
}