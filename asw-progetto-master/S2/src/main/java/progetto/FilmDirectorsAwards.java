package progetto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmDirectorsAwards {
	
	@Value("${awards}")
	private String awards;
	
	@Value("${mel.awards}")
	private String melAwards;

	@Value("${mel.braveheart.awards}")
	private String melBraveAwards;
	
	@RequestMapping("/S2/{filmDirector}/{film}")
	public String directorAwardForSpecificMovie(@PathVariable("filmDirector") String filmDirector, @PathVariable("film") String film) {
		String[] awardsArray = null;
		if(filmDirector.equals("Mel Gibson") && film.equals("Braveheart"))
			awardsArray = melBraveAwards.split(",");
		else
			awardsArray = awards.split(",");
		int i = (int) (Math.round(Math.random()*(awardsArray.length-1)));
		return awardsArray[i];
	}
	
	@RequestMapping("/S2/{filmDirector}")
	public String directorsFacts(@PathVariable String filmDirector) {
		String[] awardsArray = null;
		if(filmDirector.equals("Mel Gibson"))
			awardsArray = melAwards.split(",");
		else
			awardsArray = awards.split(",");
		int i = (int) (Math.round(Math.random()*(awardsArray.length-1)));
		return awardsArray[i];
	}
}
