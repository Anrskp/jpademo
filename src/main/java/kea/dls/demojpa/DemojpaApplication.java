package kea.dls.demojpa;

import kea.dls.demojpa.models.Post;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import kea.dls.demojpa.repositories.PostRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemojpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemojpaApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(PostRepo postRepo) {
        return (args) -> {
            Post demoPost = new Post("Bob", "Hello", "Greetings earthlings");
            postRepo.save(demoPost);
        };
    }

}

