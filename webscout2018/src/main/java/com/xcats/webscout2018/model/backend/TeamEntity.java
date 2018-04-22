package com.xcats.webscout2018.model.backend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.PitData;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.Team;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

@Entity
@Table(name="teams", schema = "event")
public class TeamEntity implements Serializable,Team {

	@Id
	@Column(name = "team_num")
	private int teamNum;

	@Column(name = "team_name")
	private String teamName;

	@Embedded
	private PitDataEntity pitData;

	@OneToMany(mappedBy = "team")
	private List<MatchDataEntity> matches;

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
	public void setPitData(PitData pitData) {
		this.pitData = (PitDataEntity) pitData;
	}

	@Override
	public List<MatchDataEntity> getMatchData() {
		return matches;
	}

	@Override
	public void addMatchData(MatchData matchData) {
		this.matches.add((MatchDataEntity) matchData);
	}

	@JsonInclude
	@Override
	public TeamStats getStats() {
		return new com.xcats.webscout2018.model.backend.TeamStats(this.matches);
	}
}
