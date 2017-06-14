package it.uniroma3.progettoasw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

import it.uniroma3.progettoasw.client.S1Client;
import it.uniroma3.progettoasw.client.S2Client;

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
