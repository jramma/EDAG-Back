package com.joBarcelona.edag.model.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.joBarcelona.edag.model.domain.CenterInfo;

public interface CenterRepository extends MongoRepository<CenterInfo,String>{

}
