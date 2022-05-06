package com.restapp.services;

import java.net.InetAddress;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class ExampleService implements InitializingBean {
	private String hostName;

	public String getHostName() {
		return hostName;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		InetAddress ip = InetAddress.getLocalHost();
		hostName = ip.getHostName();
	}
}
