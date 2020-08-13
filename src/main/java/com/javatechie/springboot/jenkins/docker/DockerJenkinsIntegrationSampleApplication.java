package com.javatechie.springboot.jenkins.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsIntegrationSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
	}
	@GetMapping("/hello")
	public String getMessage()
	{
		return "This comment is from getMessage!!!!";
	}

}
