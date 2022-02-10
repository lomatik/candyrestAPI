package ua.lomatik.shopAPI.DBServices;

import org.springframework.stereotype.Service;
import ua.lomatik.shopAPI.DBEntities.Candy;
import ua.lomatik.shopAPI.DBRepositories.CandyRepository;
import ua.lomatik.shopAPI.response.RestApiException;

import java.util.List;
import java.util.Optional;

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
        if ((candyRepository.findCandyByBarCode(candy.getBar_code()).isPresent())) {
            throw new RestApiException("BarCode is busy");
        }
        candyRepository.save(candy);
    }

    public void delete(Long id){
        candyRepository.deleteById(id);
    }

    public void update(Candy candy) {
        Optional<Candy> row = candyRepository.findById(candy.getId());
        if(row.isPresent()) {
            Candy item = row.get();
            if(!candy.getName().isEmpty()){
                item.setName(candy.getName());
            }
            if(candy.getBar_code() != 0){
                item.setBar_code(candy.getBar_code());
            }
            candyRepository.save(item);
        }
    }
}
