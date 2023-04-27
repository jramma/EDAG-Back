package com.joBarcelona.edag.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joBarcelona.edag.model.domain.MealInfo;

public interface MealInfoRepo extends MongoRepository<MealInfo,String> {

}
