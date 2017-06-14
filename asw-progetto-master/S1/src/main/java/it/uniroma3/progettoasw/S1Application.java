package it.uniroma3.progettoasw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class S1Application {

	public static void main(String[] args) {
		SpringApplication.run(S1Application.class, args);
	}
}
