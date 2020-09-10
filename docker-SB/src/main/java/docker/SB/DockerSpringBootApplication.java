package docker.SB;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"docker.rest"})
public class DockerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}

}
