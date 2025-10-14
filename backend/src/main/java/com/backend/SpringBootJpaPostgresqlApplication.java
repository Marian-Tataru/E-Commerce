package com.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.backend.Config.RsaKeyPropertiesConfig;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyPropertiesConfig.class)
public class SpringBootJpaPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaPostgresqlApplication.class, args);
	}

}
