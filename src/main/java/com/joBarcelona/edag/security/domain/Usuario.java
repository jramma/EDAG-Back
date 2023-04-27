package com.joBarcelona.edag.security.domain;

import java.util.List;

import com.joBarcelona.edag.security.dto.Rol;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document (collection="users")
public class Usuario {
	
	@Id
	private String id;
	private String username;
	private String password;
	private List<Rol> roles;
	
	public Usuario(String username, String password, List<Rol>roles) {	
		this.username=username;
		this.password=password;
		this.roles=roles;
	}
	

}
