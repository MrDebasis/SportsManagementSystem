package com.authorization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorization.models.Tournament;

@Service
public class TournamentService {
	@Autowired
	private com.authorization.repository.TournamentRepository TournamentRepository;
	
	public List<Tournament> touranamentGroups() {
		return TournamentRepository.findAll();		   
	}
}
