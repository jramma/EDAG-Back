package com.joBarcelona.edag.controller;


import java.util.ArrayList;
import java.util.List;

import com.joBarcelona.edag.model.domain.*;
import com.joBarcelona.edag.model.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {

	@Autowired
	FootballService service;
	@GetMapping("/teams")
	public List<AllTeam> getAllSquads() {

		return service.getAllSquads();
	}

	@GetMapping("/teamData")
	public List<TeamInfo> getTeamData() {

		return service.getTeamData();
	}
	@GetMapping("/players")
	public List<Player> getPlayers() {

		return service.getPlayer();
	}



}
