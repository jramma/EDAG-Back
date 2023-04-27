package com.joBarcelona.edag.security.repository;

import java.util.List;
import java.util.Optional;

import com.joBarcelona.edag.security.domain.Usuario;
import com.joBarcelona.edag.security.dto.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<Usuario, String>{
	Optional<Usuario> findByUsername(String username);
	boolean existsByUsername(String username);
	
	List <Usuario> findByRoles(Rol rol);

}
