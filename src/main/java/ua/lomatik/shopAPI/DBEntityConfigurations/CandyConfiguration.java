package ua.lomatik.shopAPI.DBEntityConfigurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.lomatik.shopAPI.DBEntities.CandyEntity;
import ua.lomatik.shopAPI.DBRepositories.CandyRepository;

import java.util.List;

@Configuration
public class CandyConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(CandyRepository candyRepository){
        return args -> {
            List<CandyEntity> entities = new java.util.ArrayList<>();
            entities.add(new CandyEntity("Рачки", 1234567890));
            entities.add(new CandyEntity("Конфетті", 1234567892));
            entities.add(new CandyEntity("ЖЛ", 1234567890));
            candyRepository.saveAll(entities);
        };
    }

}
