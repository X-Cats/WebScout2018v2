package com.xcats.webscout2018;

import com.xcats.webscout2018.model.backend.PitDataEntity;
import com.xcats.webscout2018.model.backend.TeamEntity;
import com.xcats.webscout2018.repositories.backend.PitDataRepository;
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
	CommandLineRunner init(TeamDataRepository repo, PitDataRepository pitRepo) {
		return args -> {
			TeamEntity xcats = new TeamEntity(191,"X-Cats");
			TeamEntity roccity = new TeamEntity(3838,"Roc City Robotix");
			repo.save(xcats);
			repo.save(roccity);
			PitDataEntity xdata = new PitDataEntity(xcats,true);
			pitRepo.save(xdata);
			//repo.findAll().forEach(System.out::println);
		};
	}
}
