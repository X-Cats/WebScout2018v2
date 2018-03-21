package com.xcats.webscout2018;

import com.xcats.webscout2018.configuration.XScoutSecurityConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Webscout2018Configuration {
	@Autowired
	XScoutSecurityConfiguration securityConfiguration;
}
