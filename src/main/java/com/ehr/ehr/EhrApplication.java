package com.ehr.ehr;

import com.ehr.ehr.controller.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories
@EnableConfigurationProperties(RsaKeyProperties.class)
public class EhrApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhrApplication.class, args);
	}

}
