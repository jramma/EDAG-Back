package com.joBarcelona.edag.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joBarcelona.edag.model.domain.WeeklyDemand;

public interface WeeklyDemandRepository extends MongoRepository<WeeklyDemand,String>{

}
