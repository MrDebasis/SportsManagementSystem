package com.authorization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.authorization.models.MyUserDetails;
import com.authorization.models.Players;
import com.authorization.repository.PlayersRepository;
@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	private PlayersRepository playersRepository;

	@Override
	public UserDetails loadUserByUsername(String playersName) throws UsernameNotFoundException {
		
		Players players= playersRepository.findByPlayersName(playersName);
		if(players==null) {
			throw new UsernameNotFoundException("UserName is not found"+playersName);
		}
		return new MyUserDetails(players);
	}

}
