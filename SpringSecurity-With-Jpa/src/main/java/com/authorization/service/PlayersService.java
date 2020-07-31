package com.authorization.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorization.models.Players;
import com.authorization.repository.PlayersRepository;

@Service
public class PlayersService {
	
	@Autowired
	private PlayersRepository playersRepository;
	
	public Players addPlayers(Players players) {
		return playersRepository.save(players);	
	}
	public List<Players> findAllPlayers() {
		return playersRepository.findAll();	
	}
	public Optional<Players> findByPlayersId(Integer id) {
		return playersRepository.findById(id);
		
	}

}
