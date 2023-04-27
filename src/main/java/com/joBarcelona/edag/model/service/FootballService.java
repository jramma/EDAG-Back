package com.joBarcelona.edag.model.service;

import com.joBarcelona.edag.model.domain.AllTeam;
import com.joBarcelona.edag.model.domain.Player;
import com.joBarcelona.edag.model.domain.TeamInfo;
import com.joBarcelona.edag.model.repository.AllTeam1;
import com.joBarcelona.edag.model.repository.AllTeamRepo;
import com.joBarcelona.edag.model.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballService {
    @Autowired
    AllTeamRepo allTeamRepo;
    @Autowired
    AllTeam1 allTeam1;
    @Autowired
    PlayerRepo repo;

    public List<AllTeam> getAllSquads() {

        return allTeamRepo.findAll();
    }
    public List<TeamInfo> getTeamData() {

        return allTeam1.findAll();
    }
    public List<Player> getPlayer() {

        return repo.findAll();
    }

}