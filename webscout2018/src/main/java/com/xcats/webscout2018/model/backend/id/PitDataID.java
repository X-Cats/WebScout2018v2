package com.xcats.webscout2018.model.backend.id;

import com.xcats.webscout2018.model.backend.TeamEntity;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class PitDataID implements Serializable{
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="team_num",nullable = false)
	private TeamEntity team;

	public PitDataID(TeamEntity t) {
		this.team = t;
	}

	@SuppressWarnings("unused")
	protected PitDataID() {

	}

	public TeamEntity getTeam() {
		return team;
	}
}
