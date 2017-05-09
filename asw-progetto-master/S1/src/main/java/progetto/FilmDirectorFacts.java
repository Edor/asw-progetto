package progetto;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmDirectorFacts {
	
	@Value("${adjectives}")
	private String adjectives;
	
	@Value("${mel.adjectives}")
	private String melAdjectives;
	
	@RequestMapping("/S1/{filmDirector}")
	public String directorsFacts(@PathVariable String filmDirector) {
		String[] adjectivesArray = null;
		if(filmDirector.equals("Mel Gibson"))
			adjectivesArray = melAdjectives.split(",");
		else
			adjectivesArray = adjectives.split(",");
		
		int i = (int) (Math.round(Math.random()*(adjectivesArray.length-1)));
		return adjectivesArray[i];
	}
}



