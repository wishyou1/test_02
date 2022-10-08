package com.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan(basePackages = "com.alex")
@EnableAsync
@EnableSwagger2
public class SpringTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringTestApplication.class, args);
	}

}
