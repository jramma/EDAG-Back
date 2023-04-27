package com.joBarcelona.edag.model.repository;

import com.joBarcelona.edag.model.domain.AllTeam;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AllTeamRepo extends MongoRepository<AllTeam,String> {
    @Query("{ }")
    List<String> findAllByUrl_Imagen();
}
