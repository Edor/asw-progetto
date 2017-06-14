package it.uniroma3.progettoasw;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface S2Service {
	
	public String getAward(String filmDirector);
	public String getAwardForFilm(String filmDirector, String film);

}
