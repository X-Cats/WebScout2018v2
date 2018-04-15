package com.xcats.webscout2018.services.backend;

import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.Team;
import com.xcats.webscout2018.model.backend.TeamEntity;
import com.xcats.webscout2018.repositories.backend.TeamDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamDataService {
	@Autowired
	TeamDataRepository teamRepo;

	public TeamEntity getTeam(int teamNum) {
		return teamRepo.findByTeamNum(teamNum);
	}

	public List<Team> getAllTeamData() {
		Iterable<TeamEntity> teams = this.teamRepo.findAll();
		List<Team> out = new ArrayList<>();
		for (TeamEntity t : teams) {
			out.add(t);
		}
		return out;
	}
	public Team getTeamDataByTeamNum(int teamnum) {
		TeamEntity team = this.teamRepo.findByTeamNum(teamnum);
		return team;
	}
}
