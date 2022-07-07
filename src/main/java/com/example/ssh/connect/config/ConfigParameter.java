package com.example.ssh.connect.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigParameter {

	@Value("${ssh.forward.lhost}")
	String lhost;

	@Value("${ssh.forward.lport}")
	int lport;

	@Value("${ssh.forward.rhost}")
	String rhost;

	@Value("${ssh.forward.rport}")
	int rport;

	@Value("${ssh.settings.username}")
	String user;

	@Value("${ssh.settings.password}")
	String password;

	@Value("${ssh.settings.host}")
	String host;

	@Value("${ssh.settings.port}")
	int port;

}
