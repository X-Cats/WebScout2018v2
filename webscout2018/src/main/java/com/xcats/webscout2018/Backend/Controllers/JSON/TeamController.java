package com.xcats.webscout2018.Backend.Controllers.JSON;

import com.xcats.webscout2018.Backend.Entities.TeamEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeamController {

	@GetMapping("/teams")
	@ResponseBody
	public TeamEntity getEntity(@RequestParam(name = "num",required = true) int number, @RequestParam(name = "name", required = false, defaultValue = " ") String name) {
		return new TeamEntity(number,name);
	}
}
