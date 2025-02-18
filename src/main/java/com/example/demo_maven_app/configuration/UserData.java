package com.example.demo_maven_app.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RefreshScope
@ConfigurationProperties(prefix = "user")
@Component
public class UserData {
	String firstName;
	String lastName;
}
