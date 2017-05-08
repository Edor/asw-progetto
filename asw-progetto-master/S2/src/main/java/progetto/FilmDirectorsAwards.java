package progetto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmDirectorsAwards {
	
	@Value("${awards}")
	private String awards;
	
	@RequestMapping("/S2/{filmDirector}/{film}")
	public String directorAwardForSpecificMovie() {
		String[] awardsArray = awards.split(",");
		int i = (int) (Math.round(Math.random()*(awardsArray.length-1)));
		return awardsArray[i];
	}
	
	@RequestMapping("/S2/{filmDirector}")
	public String directorsFacts(@PathVariable String filmDirector) {
		String[] awardsArray = awards.split(",");
		int i = (int) (Math.round(Math.random()*(awardsArray.length-1)));
		return awardsArray[i];
	}
}
