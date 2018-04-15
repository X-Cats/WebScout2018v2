package com.xcats.webscout2018.model.backend;

import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.PitData;
import com.xcats.webscout2018.model.backend.id.PitDataID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pit_data", schema = "event")
public class PitDataEntity implements PitData {

	@Id
	private PitDataID id;
	private boolean autoBaselineCross;

	public PitDataEntity(TeamEntity team, boolean autoBaselineCross) {
		this.id = new PitDataID(team);
		this.autoBaselineCross = autoBaselineCross;
	}

	protected PitDataEntity() {

	}

	@Override
	public boolean getAutoBaselineCross() {
		return this.autoBaselineCross;
	}

	@Override
	public Team getTeam() {
		return this.id.getTeam();
	}
}
