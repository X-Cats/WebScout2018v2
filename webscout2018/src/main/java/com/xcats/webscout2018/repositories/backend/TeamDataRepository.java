package com.xcats.webscout2018.repositories.backend;

import com.xcats.webscout2018.model.backend.TeamEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "teams", path = "teams")
public interface TeamDataRepository extends PagingAndSortingRepository<TeamEntity, Integer> {
	TeamEntity findByTeamNum(@Param("num") int num);
}
