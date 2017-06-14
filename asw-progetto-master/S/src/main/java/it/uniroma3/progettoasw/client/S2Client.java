package it.uniroma3.progettoasw.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("S2")
public interface S2Client {

	@RequestMapping(value="/S2/{filmDirector}", method=RequestMethod.GET)
	public String getAward(@PathVariable("filmDirector") String filmDirector);
	
	@RequestMapping(value="/S2/{filmDirector}/{film}", method=RequestMethod.GET)
	public String getAwardForFilm(@PathVariable("filmDirector") String filmDirector, @PathVariable("film") String film);
}

