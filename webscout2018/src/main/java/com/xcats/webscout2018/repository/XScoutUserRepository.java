package com.xcats.webscout2018.repository;

import com.xcats.webscout2018.model.security.XScoutUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface XScoutUserRepository extends JpaRepository<XScoutUser, Long> {
	XScoutUser findByUsername(String username);
}
