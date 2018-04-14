package com.xcats.webscout2018.services.backend;

import com.xcats.XcatsScoutingLib.General.Data.TeamObject;
import com.xcats.XcatsScoutingLib.General.Data.processed.ProcTeamObject;
import com.xcats.webscout2018.model.backend.TeamEntity;
import com.xcats.webscout2018.repositories.backend.MatchDataRepository;
import com.xcats.webscout2018.repositories.backend.PitDataRepository;
import com.xcats.webscout2018.repositories.backend.TeamDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TeamDataService {
	@Autowired
	TeamDataRepository teamRepo;

	@Autowired
	MatchDataRepository matchRepo;

	@Autowired
	PitDataRepository pitDataRepo;

	public List<TeamObject> getAllTeamData() {
		Iterable<TeamEntity> teams = this.teamRepo.findAll();
		List<TeamObject> out = new ArrayList<>();
		for (TeamEntity t : teams) {
			out.add(new ProcTeamObject(pitDataRepo.findById_Team(t), matchRepo.findAllById_Team(t), null, t));
		}
		return out;
	}
	public TeamObject getTeamDataByTeamNum(int teamnum) {
		TeamEntity team = this.teamRepo.findByTeamNum(teamnum);
		ProcTeamObject out = new ProcTeamObject(pitDataRepo.findById_Team(team), matchRepo.findAllById_Team(team), null, team);
		return out;
	}
}
