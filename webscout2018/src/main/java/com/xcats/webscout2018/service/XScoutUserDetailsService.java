package com.xcats.webscout2018.service;

import com.xcats.webscout2018.model.security.XScoutUser;
import com.xcats.webscout2018.repository.XScoutUserRepository;
import com.xcats.webscout2018.Security.XScoutUserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class XScoutUserDetailsService implements UserDetailsService {

	@Autowired
	private XScoutUserRepository repo;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		XScoutUser user = repo.findByUsername(username);
		if(user == null) throw new UsernameNotFoundException(username);
		return new XScoutUserPrincipal(user);
	}
}
