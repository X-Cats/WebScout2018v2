package com.xcats.webscout2018;

import com.xcats.webscout2018.model.backend.TeamEntity;
import com.xcats.webscout2018.repositories.backend.TeamDataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Webscout2018Application {

	public static void main(String[] args) {
		SpringApplication.run(Webscout2018Application.class, args);
	}

	@Bean
	@Profile("dev")
	CommandLineRunner init(TeamDataRepository repo) {
		return args -> {
			TeamEntity xcats = new TeamEntity(191,"X-Cats");
			TeamEntity roccity = new TeamEntity(3838,"Roc City Robotix");
			repo.save(xcats);
			repo.save(roccity);
			//repo.findAll().forEach(System.out::println);
		};
	}
}
