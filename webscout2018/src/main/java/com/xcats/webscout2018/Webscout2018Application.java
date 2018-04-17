package com.xcats.webscout2018;

import com.xcats.XcatsScoutingLib.General.Enums.Alliance;
import com.xcats.XcatsScoutingLib.General.Enums.DriverPosition;
import com.xcats.XcatsScoutingLib.General.Enums.RobotPosition;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.PowerupElementPos;
import com.xcats.webscout2018.model.backend.MatchDataEntity;
import com.xcats.webscout2018.model.backend.PitDataEntity;
import com.xcats.webscout2018.model.backend.TeamEntity;
import com.xcats.webscout2018.repositories.backend.MatchDataRepository;
import com.xcats.webscout2018.repositories.backend.TeamDataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Webscout2018Application {

	public static void main(String[] args) {
		SpringApplication.run(Webscout2018Application.class, args);
	}

	@Bean
	@Profile("dev")
	CommandLineRunner init(TeamDataRepository repo, MatchDataRepository matchRepo) {
		return args -> {
			TeamEntity xcats = new TeamEntity(191,"X-Cats");
			TeamEntity roccity = new TeamEntity(3838,"Roc City Robotix");
			repo.save(xcats);
			repo.save(roccity);
			xcats.setPitData(new PitDataEntity(true));
			MatchDataEntity toAdd = new MatchDataEntity(xcats, 1, Alliance.BLUE,
					"bashterm", DriverPosition.CENTER, RobotPosition.CENTER,
					PowerupElementPos.RIGHT,PowerupElementPos.RIGHT,PowerupElementPos.RIGHT,
					true,1,0,1,
					0, 3,0,6,1,
					0,0, 0, true, 0);
			matchRepo.save(toAdd);
			repo.save(xcats);

			//repo.findAll().forEach(System.out::println);
		};
	}
}
