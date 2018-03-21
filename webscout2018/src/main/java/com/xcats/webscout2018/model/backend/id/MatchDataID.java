package com.xcats.webscout2018.model.backend.id;

import com.xcats.webscout2018.model.backend.TeamEntity;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class MatchDataID implements Serializable {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="team_num",nullable = false)
	private TeamEntity team;

	@Column(name = "match_num")
	private final int matchNum;

	public MatchDataID(TeamEntity team, int matchNum) {
		this.team = team;
		this.matchNum = matchNum;
	}
	private MatchDataID() {this(null,0);}

	public TeamEntity getTeam() {
		return team;
	}

	public int getMatchNum() {
		return matchNum;
	}
}
