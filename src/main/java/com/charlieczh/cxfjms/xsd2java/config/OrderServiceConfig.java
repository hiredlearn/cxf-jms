package com.charlieczh.cxfjms.xsd2java.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.charlieczh.cxfjms.xsd2java.service.OrderService;

@Configuration
public class OrderServiceConfig {
	@Bean
	public Endpoint endpoint(SpringBus springBus) {
		EndpointImpl endpoint = new EndpointImpl(springBus, new OrderService());
		endpoint.publish("/OrderService");
		return endpoint;
	}
}
