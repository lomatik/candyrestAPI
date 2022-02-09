package ua.lomatik.shopAPI.DBServices;

import org.springframework.stereotype.Service;
import ua.lomatik.shopAPI.DBEntities.Candy;
import ua.lomatik.shopAPI.DBRepositories.CandyRepository;

import java.util.List;

@Service
public class CandyService {

    private final CandyRepository candyRepository;

    public CandyService(CandyRepository candyRepository) {
        this.candyRepository = candyRepository;
    }

    public List<Candy> getCandies() {
        return candyRepository.findAll();
    }

    public void add(Candy candy){
        candyRepository.save(candy);
    }
}
