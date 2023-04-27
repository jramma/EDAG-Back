package com.joBarcelona.edag.model.repository;

import com.joBarcelona.edag.model.domain.TeamInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AllTeam1  extends MongoRepository<TeamInfo,String> {

}
