package com.joBarcelona.edag.controller;


import java.util.List;

import com.joBarcelona.edag.model.domain.*;
import com.joBarcelona.edag.model.service.MarketService;
import com.joBarcelona.edag.security.domain.Usuario;
import com.joBarcelona.edag.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {

	@Autowired
    MarketService marketService;

	@Autowired
    UserService userService;


	@GetMapping("/")
	public AllTeam getClientes() {

		return "¡Bienvenida!";
	}
	@GetMapping("/team")
	public Team getPlayers(){
		return
	}
	@GetMapping("/player")
	public Player getMatches(){
			return
		}
	@GetMapping("/teams"){
		public List<Team> geTeams(){
			return
		}
	
	
}
