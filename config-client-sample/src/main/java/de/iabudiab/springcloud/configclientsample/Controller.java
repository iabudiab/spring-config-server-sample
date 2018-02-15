package de.iabudiab.springcloud.configclientsample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {

	@Value("${greeting}")
	String greeting = "No Greeting";

	@GetMapping
	public String home() {
		return greeting;
	}
}
