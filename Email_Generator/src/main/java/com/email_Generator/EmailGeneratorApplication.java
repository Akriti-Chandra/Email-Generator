package com.email_Generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmailGeneratorApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EmailGeneratorApplication.class, args);
	}
	
	public SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder.sources(EmailGeneratorApplication.class);
	}

}
