package com.joBarcelona.edag.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joBarcelona.edag.model.domain.Progresion;

public interface ProgRepo extends MongoRepository<Progresion, String> {

}
