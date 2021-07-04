package com.charlieczh.cxfjms.wsdl2java.config;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.jms.JMSConfigFeature;
import org.apache.cxf.transport.jms.JMSConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.charlieczh.cxfjms.wsdl2java.service.impl.OrderServiceImpl;

import javax.jms.ConnectionFactory;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;

@Configuration
public class JmsSoapServiceConfig {

	@Bean
	public Endpoint jmsEndpoint(SpringBus bus, JMSConfigFeature jmsConfigFeature) {
		EndpointImpl endpoint = new EndpointImpl(bus, new OrderServiceImpl(), SOAPBinding.SOAP12HTTP_BINDING);
		endpoint.getFeatures().add(jmsConfigFeature);
		endpoint.publish("jms://");
		return endpoint;
	}

	@Bean
	public JMSConfigFeature jmsConfigFeature(ConnectionFactory mqConnectionFactory) {
		JMSConfigFeature feature = new JMSConfigFeature();

		JMSConfiguration jmsConfiguration = new JMSConfiguration();
		jmsConfiguration.setConnectionFactory(mqConnectionFactory);
		jmsConfiguration.setTargetDestination("request.queue");
		jmsConfiguration.setMessageType("text");

		feature.setJmsConfig(jmsConfiguration);
		return feature;
	}
}
