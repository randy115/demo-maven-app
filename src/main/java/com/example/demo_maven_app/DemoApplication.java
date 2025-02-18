package com.example.demo_maven_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;

@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
		ch.qos.logback.classic.Logger reloaderLogger = loggerContext
				.getLogger("org.springframework.cloud.kubernetes.config.reloader");
		reloaderLogger.setLevel(Level.DEBUG);
		SpringApplication.run(DemoApplication.class, args);
		logger.debug("This is a DEBUG log message from DemoApplication!");

	}

}
