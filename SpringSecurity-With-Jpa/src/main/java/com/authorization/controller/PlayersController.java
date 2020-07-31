package com.authorization.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.authorization.models.Players;
import com.authorization.service.PlayersService;


@RestController
@RequestMapping("/players")
public class PlayersController {
	
	@Autowired
	private PlayersService playersService;
	
	@PostMapping("/add")
	public Players addPlayers(@RequestBody Players players ) {
		return playersService.addPlayers(players);	
	}
	@GetMapping("/findall")
	public List<Players> findPlayers() {
		return playersService.findAllPlayers();	
	}
	@GetMapping("/findby/{id}")
	public Optional<Players> findById(@PathVariable Integer id) {
		return playersService.findByPlayersId(id);	
	}
	//need to do delete By id and modify players
	
	
	
	
	 

}
