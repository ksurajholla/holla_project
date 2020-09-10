package docker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloWorld {
	@GetMapping
	public String hello()
	{
		return "Hi Docker";
		
	}

}
