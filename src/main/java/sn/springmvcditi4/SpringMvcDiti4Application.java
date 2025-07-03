package sn.springmvcditi4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sn.springmvcditi4.entity.Personne;
import sn.springmvcditi4.repository.PersonneRepository;

@SpringBootApplication
public class SpringMvcDiti4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcDiti4Application.class, args);
    }

    @Bean
    CommandLineRunner run(PersonneRepository personneRepository) {
        return args -> {
           // personneRepository.save(new Personne("Jack", "Bauer",20, "DITI4"));
            //personneRepository.save(new Personne("Jack", "Bauer",20, "DITI4"));

            System.out.println(personneRepository.findByNomAndPrenom("Jack", "Bauer").size());

        };
    }

}
