package com.authorization.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.authorization.models.Rounds;
import com.authorization.repository.RoundsRepository;

@RestController
@RequestMapping("/touranament")
public class RoundsController {
	@Autowired
	private RoundsRepository roundsRepository;
	
	@GetMapping("/rounds")
	public List<Rounds> rounds() {
		return roundsRepository.findAll();		   
	}
	//need to write update for points during match

}
