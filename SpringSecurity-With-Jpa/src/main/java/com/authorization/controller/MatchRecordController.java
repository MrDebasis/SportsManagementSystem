package com.authorization.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.authorization.models.Players;
import com.authorization.service.ExcelGeneratorRecoedsOfMatches;
import com.authorization.service.PlayersService;

@RestController
@RequestMapping("/touranament")
public class MatchRecordController {
	
	@Autowired
	private PlayersService playersService;
	
	@GetMapping(value = "/download/Record.xlsx") 
	public ResponseEntity<InputStreamResource> excelResourcesReport() throws IOException {

		List<Players> Players =
				(List<Players>)playersService.findAllPlayers();

		ByteArrayInputStream in = ExcelGeneratorRecoedsOfMatches.resourcessToExcel(Players);

		HttpHeaders headers = new HttpHeaders(); headers.add("Content-Disposition",
				"attachment; filename=Record.xlsx");

		return ResponseEntity
				.ok() 
				.headers(headers) 
				.body(new InputStreamResource(in)); 
	}
	
	
}
