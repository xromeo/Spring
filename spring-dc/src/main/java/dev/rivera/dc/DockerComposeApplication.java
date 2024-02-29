package dev.rivera.dc;

import dev.rivera.dc.model.Post;
import dev.rivera.dc.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerComposeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerComposeApplication.class, args);
		Math.

	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository repository){
		return args -> repository.save(new Post("Hello", "My first post"));
	}



}
