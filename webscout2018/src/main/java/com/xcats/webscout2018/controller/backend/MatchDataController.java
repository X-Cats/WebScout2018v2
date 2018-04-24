package com.xcats.webscout2018.controller.backend;

import com.xcats.XcatsScoutingLib.General.Enums.Alliance;
import com.xcats.XcatsScoutingLib.General.Enums.DriverPosition;
import com.xcats.XcatsScoutingLib.General.Enums.RobotPosition;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.PowerupElementPos;
import com.xcats.webscout2018.controller.backend.wrappers.MatchDataRequestWrapper;
import com.xcats.webscout2018.model.backend.MatchDataEntity;
import com.xcats.webscout2018.repositories.backend.MatchDataRepository;
import com.xcats.webscout2018.repositories.backend.TeamDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@RestController
public class MatchDataController {
	@Autowired
	TeamDataRepository teamRepo;

	@Autowired
	MatchDataRepository repo;

	@CrossOrigin
	@RequestMapping(value = "/matchdata", method = RequestMethod.POST)
	public void saveMatchData(@RequestParam("file") MultipartFile file) {
		BufferedReader br;
		int teamNum;
		MatchDataEntity outEntity;
		try {
			String currLine;
			InputStream is = file.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			while((currLine = br.readLine()) != null) {
				List<String> data = Arrays.asList(currLine.split(","));
				try {
					if(repo.findMatchDataEntitiesByTeamAndMatchNum(teamRepo.findByTeamNum(Integer.parseInt(data.get(0))),
							Integer.parseInt(data.get(1))) == null) {
						repo.save(
								new MatchDataEntity(teamRepo.findByTeamNum(Integer.parseInt(data.get(0))),
										Integer.parseInt(data.get(1)), Alliance.parseFromString(data.get(2)),
										"xcats", DriverPosition.parseFromString(data.get(6)), RobotPosition.parseFromString(data.get(7)),
										PowerupElementPos.parseFromString(data.get(3)), PowerupElementPos.parseFromString(data.get(4)),
										PowerupElementPos.parseFromString(data.get(5)),
										Boolean.parseBoolean(data.get(8)),
										Integer.parseInt(data.get(9)),
										Integer.parseInt(data.get(10)), Integer.parseInt(data.get(11)), Integer.parseInt(data.get(12)),
										Integer.parseInt(data.get(13)),Integer.parseInt(data.get(14)),Integer.parseInt(data.get(15)),Integer.parseInt(data.get(16)),
										Integer.parseInt(data.get(17)),Integer.parseInt(data.get(18)),Integer.parseInt(data.get(19)), Boolean.parseBoolean(data.get(20)),
										0
										)
						);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
