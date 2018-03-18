package com.xcats.webscoutredux.Backend.Entities;

import com.xcats.XcatsScoutingLib.General.Data.Team;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@RepositoryRestResource(collectionResourceRel = "teams", path="/teams")
@Entity
@Table(name="teams", schema = "test")
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
	public int getNum() {
		return this.teamNum;
	}

	@Override
	public String getName() {
		return this.getName();
	}
}
