package com.joBarcelona.edag.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joBarcelona.edag.model.domain.Count;

public interface CountRepo extends  MongoRepository<Count,String>{

}
