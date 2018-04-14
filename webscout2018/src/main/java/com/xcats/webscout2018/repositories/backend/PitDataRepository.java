package com.xcats.webscout2018.repositories.backend;

import com.xcats.webscout2018.model.backend.PitDataEntity;
import com.xcats.webscout2018.model.backend.TeamEntity;
import com.xcats.webscout2018.model.backend.id.PitDataID;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PitDataRepository extends PagingAndSortingRepository<PitDataEntity,PitDataID> {
	PitDataEntity findById_Team(TeamEntity team);
}
