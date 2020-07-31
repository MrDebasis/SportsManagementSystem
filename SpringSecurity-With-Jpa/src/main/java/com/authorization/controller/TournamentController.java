package com.authorization.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.authorization.models.Tournament;
import com.authorization.service.TournamentService;

@RestController
@RequestMapping("/touranament")
public class TournamentController {
	@Autowired
	private TournamentService tournamentService;
	
	@GetMapping("/event/groups")
	public List<Tournament> touranamentFemale() {
		return tournamentService.touranamentGroups();		   
	}

}
