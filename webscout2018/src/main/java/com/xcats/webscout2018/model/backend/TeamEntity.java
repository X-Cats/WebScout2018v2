package com.xcats.webscout2018.model.backend;

import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.PitData;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.Team;
import com.xcats.XcatsScoutingLib.Powerup2018.Stats.TeamStats;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="teams", schema = "event")
public class TeamEntity implements Serializable,Team {

	@Id
	@Column(name = "team_num")
	private int teamNum;

	@Column(name = "team_name")
	private String teamName;

	@OneToOne(fetch = FetchType.LAZY,
		cascade = CascadeType.ALL,
		mappedBy = "team")
	private PitDataEntity pitData;

	@OneToMany(mappedBy = "team")
	private Set<MatchDataEntity> matches;

	public TeamEntity(int teamNum, String teamName) {
		this.teamNum = teamNum;
		this.teamName = teamName;
	}

	protected TeamEntity() {

	}

	public int getTeamNum() {
		return this.teamNum;
	}

	public String getTeamName() {
		return this.teamName;
	}

	@Override
	public PitData getPitData() {
		return pitData;
	}

	@Override
	public Set<MatchDataEntity> getMatchData() {
		return matches;
	}

	@Override
	public TeamStats getStats() {
		return null;
	}
}
