package com.xcats.webscout2018.controller.backend;

import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.PitData;
import com.xcats.webscout2018.model.backend.PitDataEntity;
import com.xcats.webscout2018.services.backend.PitDataService;
import com.xcats.webscout2018.services.backend.TeamDataService;
import com.xcats.webscout2018.controller.backend.wrappers.PitDataRequestWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PitDataController {
	@Autowired
	PitDataService pdService;

	@Autowired
	TeamDataService teamService;


	@RequestMapping(value = "/pd", method = RequestMethod.POST)
	public void saveData(@RequestBody PitDataRequestWrapper toSave) {
		PitDataEntity entity = new PitDataEntity(toSave.getAutoBaselineCross());
		pdService.addPitData(toSave.getTeamNum(),entity);
	}

	@RequestMapping(value = "/pd", method = RequestMethod.GET)
	public PitData getData(@RequestParam(value="num") int teamNum) {
		return teamService.getTeamDataByTeamNum(teamNum).getPitData();
	}
}
