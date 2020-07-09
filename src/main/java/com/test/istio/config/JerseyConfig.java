package com.test.istio.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.test.istio.webservice.UserRest;

@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(UserRest.class);
	}
	
}