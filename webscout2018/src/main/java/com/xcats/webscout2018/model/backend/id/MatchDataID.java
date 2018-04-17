package com.xcats.webscout2018.model.backend.id;

import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.Team;
import com.xcats.webscout2018.model.backend.TeamEntity;

import javax.persistence.*;
import java.io.Serializable;

public class MatchDataID implements Serializable {
	private int team;
	private int matchNum;
}
