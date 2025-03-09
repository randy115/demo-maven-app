package com.example.demo_maven_app.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@ConfigurationProperties(prefix = "secrets")
@Component
public class SecretData {

	public String username() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String password() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String username;
	private String password;
}
