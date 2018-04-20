package com.xcats.webscout2018.controller.backend;

import com.xcats.webscout2018.controller.backend.wrappers.MatchDataRequestWrapper;
import com.xcats.webscout2018.model.backend.MatchDataEntity;
import com.xcats.webscout2018.repositories.backend.MatchDataRepository;
import com.xcats.webscout2018.repositories.backend.TeamDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MatchDataController {
	@Autowired
	TeamDataRepository teamRepo;

	@Autowired
	MatchDataRepository repo;

	@RequestMapping(value = "/matchdata", method = RequestMethod.POST)
	public void saveMatchData(@RequestBody MatchDataRequestWrapper e) {
		repo.save(e.toMatchDataEntity(teamRepo.findByTeamNum(e.getTeamNum())));
	}

}
