package com.xcats.webscout2018.model.backend;

import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.PitData;
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

	@Override
	public boolean getAutoBaselineCross() {
		return this.autoBaselineCross;
	}

	@Override
	public Team getTeam() {
		return this.id.getTeam();
	}
}
