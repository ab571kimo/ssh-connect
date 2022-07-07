package com.example.ssh.connect.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

@Configuration
public class SshConnectConfig extends ConfigParameter {

	@Bean
	public void sshConfig() {
		try {
			JSch jsch = new JSch();
			Session session = jsch.getSession(user, host, port);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(password);

			System.out.println("ssh connection...");
			session.connect();
			session.setPortForwardingL(lhost, lport, rhost, rport);
			System.out.println(lhost + ":" + lport + " -> " + rhost + ":" + rport);
		} catch (Exception e) {
			System.err.print(e);
		}
	}

}
