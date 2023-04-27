package com.joBarcelona.edag.security.controller;

import javax.validation.Valid;

import com.joBarcelona.edag.exceptions.AttributeException;
import com.joBarcelona.edag.security.domain.Usuario;
import com.joBarcelona.edag.security.dto.CreateUserDto;
import com.joBarcelona.edag.security.dto.JwtTokenDto;
import com.joBarcelona.edag.security.dto.LoginUserDto;
import com.joBarcelona.edag.security.dto.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joBarcelona.edag.security.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	UserService userService;
	
    @PostMapping("/create")
    public ResponseEntity<Mensaje> create(@Valid @RequestBody CreateUserDto dto) throws AttributeException {
        Usuario usuario = userService.create(dto);
        return ResponseEntity.ok(new Mensaje(HttpStatus.OK, "user " + usuario.getUsername() + " have been created"));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtTokenDto> login(@Valid @RequestBody LoginUserDto dto) throws AttributeException {
        JwtTokenDto jwtTokenDto = userService.login(dto);
        return ResponseEntity.ok(jwtTokenDto);
    }
}
