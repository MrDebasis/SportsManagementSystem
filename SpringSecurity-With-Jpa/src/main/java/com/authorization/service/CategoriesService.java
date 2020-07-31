package com.authorization.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorization.models.Players;

@Service
public class CategoriesService {

	@Autowired
	private PlayersService PlayersService;

	public List<Players> maleCategories() {
		List<Players> maleList = PlayersService.findAllPlayers();

		List<Players> male = maleList.stream()
				.filter(f -> f.getGender().length() == 4)
				.collect(Collectors.toList());
		return male;

	}

	public List<Players> femaleCategories() {
		List<Players> femaleList = PlayersService.findAllPlayers();

		List<Players> female = femaleList.stream()
				.filter(f -> f.getGender().length() == 6)
				.collect(Collectors.toList());
		return female;

	}
}
