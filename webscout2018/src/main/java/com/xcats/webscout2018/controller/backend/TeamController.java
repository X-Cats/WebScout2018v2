package com.xcats.webscout2018.controller.backend;

import com.xcats.webscout2018.model.backend.TeamEntity;
import com.xcats.webscout2018.repositories.backend.MatchDataRepository;
import com.xcats.webscout2018.repositories.backend.TeamDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TeamController {
	@Autowired
	TeamDataRepository teamRepo;

	@Autowired
	MatchDataRepository matchRepo;

	@RequestMapping("/teams")
	public List<ProcTeamObject> team(@RequestParam(value="num",defaultValue = "100000") int teamnum) {
		if (teamnum != 100000) {
			TeamEntity team = this.teamRepo.findByTeamNum(teamnum);
			ProcTeamObject out = new ProcTeamObject(null, matchRepo.findAllById_Team(team), null, team);
			return Arrays.asList(out);
		}
		Iterable<TeamEntity> teams = this.teamRepo.findAll();
		List<ProcTeamObject> out = new ArrayList<>();
		for (TeamEntity t : teams) {
			out.add(new ProcTeamObject(null, matchRepo.findAllById_Team(t), null, t));
		}
		return out;
	}
}
