package com.xcats.webscout2018.repositories.backend;

import com.xcats.webscout2018.model.backend.TeamEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDataRepository extends PagingAndSortingRepository<TeamEntity, Integer> {
	TeamEntity findByTeamNum(int num);
}
