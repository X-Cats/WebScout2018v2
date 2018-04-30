package com.xcats.webscout2018.model.backend;

import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.PitData;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class PitDataEntity implements Serializable,PitData {

	@Column(name = "BASELINE_CROSS")
	private boolean autoBaselineCross;

	public PitDataEntity(boolean autoBaselineCross) {
		this.autoBaselineCross = autoBaselineCross;
	}

	protected PitDataEntity() {

	}

	@Override
	public boolean getAutoBaselineCross() {
		return this.autoBaselineCross;
	}
}


