package com.authorization.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Players players;

	public MyUserDetails(Players players) {
		this.players = players;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<Roles> role = players.getRoles();
		List<SimpleGrantedAuthority> authority = new ArrayList<>();
		for (Roles roles : role)
			authority.add(new SimpleGrantedAuthority(roles.getName()));
		return authority;
	}

	@Override
	public String getPassword() {
		return players.getPassword();
	}

	@Override
	public String getUsername() {
		return players.getPlayersName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public Players getUser() {
		return players;
	}

	public void setUser(Players players) {
		this.players = players;
	}

}