package it.uniroma3.progettoasw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import it.uniroma3.progettoasw.client.S2Client;

@Service
public class S2ServiceImpl implements S2Service{
	
	@Autowired private S2Client s2Client;

	@HystrixCommand(fallbackMethod="getFallbackAward")
	public String getAward(String filmDirector) {
		return s2Client.getAward(filmDirector);
	}

	@HystrixCommand(fallbackMethod="getFallbackAwardForFilm")
	public String getAwardForFilm(String filmDirector, String film) {
		return s2Client.getAwardForFilm(filmDirector, film);
	}
	
	public String getFallbackAward(String error) {
		return "Award Fallback"; 
	}
	
	public String getFallbackAwardForFilm(String error, String error2) {
		return "AwardForFilm Fallback"; 
	}

}
