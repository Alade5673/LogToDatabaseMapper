package com.logger.rout;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RouteConfiguration extends CamelConfiguration {
	@Autowired
	LogRoute logRoute;

	@Override
	public List<RouteBuilder> routes() {
		List<RouteBuilder> routeBuilders = new ArrayList<RouteBuilder>();
		routeBuilders.add(logRoute);
		return routeBuilders;
	}

}
