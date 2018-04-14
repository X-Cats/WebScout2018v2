package com.xcats.XcatsScoutingLib.Powerup2018.Stats;

import com.xcats.XcatsScoutingLib.Powerup2018.Data.*;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.*;

public interface MatchStats extends com.xcats.XcatsScoutingLib.General.Stats.MatchStats {
	MatchData getMatchData();
	PowerupMatchFocus getFocus();
}
