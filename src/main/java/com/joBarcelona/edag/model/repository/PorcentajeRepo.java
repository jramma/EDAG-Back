package com.joBarcelona.edag.model.repository;

import com.joBarcelona.edag.model.domain.Porcentaje;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PorcentajeRepo extends MongoRepository<Porcentaje, String> {

}
