package com.xcats.webscout2018.services.backend;

import com.xcats.XcatsScoutingLib.General.Data.raw.PitData;
import com.xcats.webscout2018.model.backend.PitDataEntity;
import com.xcats.webscout2018.model.backend.TeamEntity;
import com.xcats.webscout2018.repositories.backend.PitDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;

@Service
public class PitDataService {
	@Autowired
	PitDataRepository dataRepo;

	public boolean addPitData(PitDataEntity in) {
		try {
			dataRepo.save(in);
			return true;
		} catch (EntityExistsException ex) {
			return false;
		}
	}

}
