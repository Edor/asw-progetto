package it.uniroma3.progettoasw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//added in order to find Service beans
@ComponentScan(basePackageClasses=FilmDirectorController.class)

@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class SApplication {

	public static void main(String[] args) {
		SpringApplication.run(SApplication.class, args);
	}
}
