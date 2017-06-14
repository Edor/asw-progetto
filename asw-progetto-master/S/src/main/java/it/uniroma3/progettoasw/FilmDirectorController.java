package it.uniroma3.progettoasw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmDirectorController {

	@Autowired private S1Service s1Service;
	@Autowired private S2Service s2Service;

	//@RequestMapping("/S/{filmDirector}/{film}")
	@RequestMapping("/{filmDirector}/{film}")
	public String getAwardsForSpecificFilm(@PathVariable String filmDirector, @PathVariable String film) {
		return  filmDirector + " is " + 
				s1Service.getAdjective(filmDirector) +
				" and he won a/an " +
				s2Service.getAwardForFilm(filmDirector, film) + 
				" thanks to " + 
				film; 
	}
	//@RequestMapping("/S/{filmDirector}")
	@RequestMapping("/{filmDirector}")
	public String getAdjectiveAndAward(@PathVariable String filmDirector){
		return  filmDirector + " is " + 
				s1Service.getAdjective(filmDirector) +
				" and he won a/an " +
				s2Service.getAward(filmDirector);
	}

}


