package it.uniroma3.progettoasw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FilmDirectorController {
	
	@Value("${s1.uri}")
	private String s1Uri;
	
	@Value("${s2.uri}")
	private String s2Uri;
	
	@RequestMapping("/S/{filmDirector}/{film}")
	public String getAdjectiveAndAwardForSpecificFilm(@PathVariable String filmDirector, @PathVariable String film) {
				
		return  filmDirector + " is " + 
				"\"" + getAdjective(s1Uri +  filmDirector) + "\"" +
				" and he won a/an " +
				"\"" + getAwardForFilm(s2Uri + filmDirector + "/" + film) + "\"" + 
				" thanks to " + 
				film;
		
	}
	
	@RequestMapping("/S/{filmDirector}")
	public String getAdjectiveAndAward(@PathVariable String filmDirector) {
				
		return  filmDirector + " is " + 
				"\"" + getAdjective(s1Uri +  filmDirector) + "\"" +
				" and he won a/an " +
				"\"" + getAward(s2Uri + filmDirector) + "\"" ;
				
	}

	private String getProperty(String uri) {
		return new RestTemplate().getForObject(uri,String.class);
	}
	private String getAdjective(String uri) {
		return getProperty(uri);
	}
	private String getAward(String uri) {
		return getProperty(uri);
	}
	private String getAwardForFilm(String uri){
		return getProperty(uri);
	}

}


