package com.xcats.webscout2018.services.backend;

import com.xcats.webscout2018.model.backend.PitDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;

@Service
public class PitDataService {
	@Autowired
	TeamDataService teamService;

	public void addPitData(int teamnum, PitDataEntity in) {
		teamService.setPitDataByTeamNum(teamnum,in);
	}

}
