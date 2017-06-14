package it.uniroma3.progettoasw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import it.uniroma3.progettoasw.client.S1Client;

@Service
public class S1ServiceImpl implements S1Service {
	
	@Autowired private S1Client s1Client;

	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public String getAdjective(String filmDirector) {
		return s1Client.getAdjective(filmDirector);
	}
	
	public String getFallbackAdjective(String error) {
		return "Adjective Fallback" + error; 
	}

	
}
