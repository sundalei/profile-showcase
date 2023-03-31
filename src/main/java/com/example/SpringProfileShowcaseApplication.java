package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProfileShowcaseApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringProfileShowcaseApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run();
	}

	@Bean
	CommandLineRunner commandLineRunner(YAMLConfig myConfig) {
		return args -> {
			System.out.println("using environment: " + myConfig.getEnvironment());
			System.out.println("name: " + myConfig.getName());
			System.out.println("enabled:" + myConfig.isEnabled());
			System.out.println("servers: " + myConfig.getServers());
		};
	}

}
