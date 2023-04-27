package com.joBarcelona.edag.model.repository;

import com.joBarcelona.edag.model.domain.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepo extends MongoRepository<Player,String> {
}
