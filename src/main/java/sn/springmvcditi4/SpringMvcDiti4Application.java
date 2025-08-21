package sn.springmvcditi4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import sn.springmvcditi4.entity.Personne;
import sn.springmvcditi4.repository.PersonneRepository;

@SpringBootApplication
public class SpringMvcDiti4Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringMvcDiti4Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcDiti4Application.class, args);
    }

}

