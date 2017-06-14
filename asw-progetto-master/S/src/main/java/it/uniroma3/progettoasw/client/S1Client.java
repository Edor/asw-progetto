package it.uniroma3.progettoasw.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("S1")
public interface S1Client {

	@RequestMapping(value="/S1/{filmDirector}", method=RequestMethod.GET)
	public String getAdjective(@PathVariable("filmDirector") String filmDirector);
}

