package com.authorization.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.authorization.models.Players;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

	@Autowired
	private com.authorization.service.CategoriesService CategoriesService;
	
	@GetMapping("/male")
	public List<Players> listMale() {
		return CategoriesService.maleCategories();	
	}
	@GetMapping("/female")
	public List<Players> listFemale() {
		return CategoriesService.femaleCategories();	
	}
	

}
