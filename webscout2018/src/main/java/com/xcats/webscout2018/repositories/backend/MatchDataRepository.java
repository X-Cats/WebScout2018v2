package com.xcats.webscout2018.repositories.backend;

import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.MatchData;
import com.xcats.webscout2018.model.backend.MatchDataEntity;
import com.xcats.webscout2018.model.backend.id.MatchDataID;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchDataRepository extends PagingAndSortingRepository<MatchDataEntity, MatchDataID> {
	List<MatchData> findAllByTeam(Team team);
}

