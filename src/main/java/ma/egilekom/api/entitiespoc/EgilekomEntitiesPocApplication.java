package ma.egilekom.api.entitiespoc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class EgilekomEntitiesPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(EgilekomEntitiesPocApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            log.info("Hello World");
            System.out.println("Hello World");
        };
    }

}