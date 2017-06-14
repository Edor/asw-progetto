package it.uniroma3.progettoasw;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;


@RestController
public class FilmDirectorController {

	@Autowired private S1Service s1Service;
	@Autowired private S2Service s2Service;

	@RequestMapping("/S/{filmDirector}/{film}")
	public String getAwardsForSpecificFilm(@PathVariable String filmDirector, @PathVariable String film) {
		return  filmDirector + " is " + 
				s1Service.getAdjective(filmDirector) +
				" and he won a/an " +
				s2Service.getAwardForFilm(filmDirector, film) + 
				" thanks to " + 
				film; 
	}
	@RequestMapping("/S/{filmDirector}")
	public String getAdjectiveAndAward(@PathVariable String filmDirector){
		return  filmDirector + " is " + 
				s1Service.getAdjective(filmDirector) +
				" and he won a/an " +
				s2Service.getAward(filmDirector);
	}

}


