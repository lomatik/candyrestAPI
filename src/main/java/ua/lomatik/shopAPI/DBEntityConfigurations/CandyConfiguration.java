package ua.lomatik.shopAPI.DBEntityConfigurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.lomatik.shopAPI.DBEntities.Candy;
import ua.lomatik.shopAPI.DBRepositories.CandyRepository;

import java.util.List;

@Configuration
public class CandyConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(CandyRepository candyRepository){
        return args -> {
            candyRepository.saveAll(List.of(
                    new Candy("Рачки", 1234567890),
                    new Candy("Конфетті", 1234567890),
                    new Candy("Рачки", 1234567890),
            ));
        };
    }

}
