package com.test.jaxws.service;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {

	public static void main(String[] args) {
		System.out.println("Starting...");
		Endpoint.publish("http://localhost:8888/ws/person", new PersonServiceImpl());  
		System.out.println("Closed");
	}

}