package com.ravi.springboot.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class EmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ravi.springboot"))
				.build()
				.apiInfo(apiDetails());

	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Employee Management API",
				"Sample API for EMS",
				"1.0",
				"http://github.com/ravikj17",
				new springfox.documentation.service.Contact("Ravi Jaiswal","http://github.com/ravikj17","ravikj17@gmail.com"),
				"API License",
				"http://github.com/ravikj17",
				Collections.emptyList()
		);
	}

}
