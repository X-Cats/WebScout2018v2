package com.xcats.webscout2018.model.backend;

import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.PitData;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(PitDataEntity.PitDataID.class)
public class PitDataEntity implements Serializable,PitData {

	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="team_num",nullable = false)
	private TeamEntity team;

	private boolean autoBaselineCross;

	public PitDataEntity(TeamEntity team, boolean autoBaselineCross) {
		this.team = team;
		this.autoBaselineCross = autoBaselineCross;
	}

	protected PitDataEntity() {

	}

	@Override
	public boolean getAutoBaselineCross() {
		return this.autoBaselineCross;
	}

	public Team getTeam() {
		return this.team;
	}

	public static class PitDataID implements Serializable{
		protected TeamEntity team;
		public PitDataID(TeamEntity team) {
			this.team = team;
		}

		protected PitDataID() {}
	}
}


