package com.joBarcelona.edag.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joBarcelona.edag.model.domain.NumMedioOrdersPorCentro;

public interface NumRepo extends MongoRepository<NumMedioOrdersPorCentro, String>{

}
