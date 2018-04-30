package com.xcats.webscout2018;

import com.google.gson.*;
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
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import java.net.UnknownHostException;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Webscout2018Application {

	public static void main(String[] args) {
		SpringApplication.run(Webscout2018Application.class, args);
	}

	private final String tbaHeader = "X-TBA-Auth-Key";
	private final String tbaAuthKey = "U0rx6iHZYLFx1InrycvsfhYuxgRQPORyDM07f4Ekz2fHfftxJWAbIpzMD9SIl1sd";

	private final String devUrl = "https://www.thebluealliance.com/api/v3/event/2018nyro/teams/simple";
	private final String prodUrl = "https://www.thebluealliance.com/api/v3/event/2018cars/teams/simple";

	private String url = prodUrl;

	@Bean
	CommandLineRunner init(TeamDataRepository repo, MatchDataRepository matchRepo) {
		return args -> {
			try {
				OkHttpClient client = new OkHttpClient();

				Request request = new Request.Builder()
						.header(tbaHeader, tbaAuthKey)
						.url(url)
						.build();

				Response response = client.newCall(request).execute();
				String jsonString = response.body().string();
				JsonElement jsonElement = new JsonParser().parse(jsonString);
				JsonArray teamObjectArray = jsonElement.getAsJsonArray();
				for (int i = 0; i < teamObjectArray.size(); i++) {
					JsonObject object = teamObjectArray.get(i).getAsJsonObject();
					repo.save(new TeamEntity(object.get("team_number").getAsInt(), object.get("nickname").getAsString()));
				}
			} catch(UnknownHostException e) {

			}
		};
	}
}
