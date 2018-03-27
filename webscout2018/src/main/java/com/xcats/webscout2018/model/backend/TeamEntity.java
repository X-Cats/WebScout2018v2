package com.xcats.webscout2018.model.backend;

import com.xcats.XcatsScoutingLib.General.Data.Team;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teams", schema = "event")
public class TeamEntity implements Team{

	@Id
	@Column(name = "team_num")
	private int teamNum;

	@Column(name = "team_name")
	private String teamName;

	public TeamEntity(int teamNum, String teamName) {
		this.teamNum = teamNum;
		this.teamName = teamName;
	}
	@Override
	public int getTeamNum() {
		return this.teamNum;
	}

	@Override
	public String getTeamName() {
		return this.teamName;
	}
}
