package com.xcats.webscout2018.controller.backend;

import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.Team;
import com.xcats.webscout2018.services.backend.TeamDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TeamController {
	@Autowired
	TeamDataService teamService;

	@CrossOrigin
	@RequestMapping("/teams")
	public List<Team> team(@RequestParam(value="num",defaultValue = "100000") int teamnum) {
		if (teamnum != 100000) {
			return Arrays.asList(teamService.getTeamDataByTeamNum(teamnum));
		}
		return teamService.getAllTeamData();
	}
}
