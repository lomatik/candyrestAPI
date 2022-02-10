package ua.lomatik.shopAPI.DBServices;

import org.springframework.stereotype.Service;
import ua.lomatik.shopAPI.DBEntities.CandyEntity;
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

    public List<CandyEntity> getCandies() {
        return candyRepository.findAll();
    }

    public void add(CandyEntity candyEntity){
        if ((candyRepository.findCandyByBarCode(candyEntity.getBarCode()).isPresent())) {
            throw new RestApiException("BarCode is busy");
        }
        candyRepository.save(candyEntity);
    }

    public void delete(Long id){
        candyRepository.deleteById(id);
    }

    public void update(CandyEntity candyEntity) {
        Optional<CandyEntity> row = candyRepository.findById(candyEntity.getId());
        if(row.isPresent()) {
            CandyEntity item = row.get();
            if(!candyEntity.getName().isEmpty()){
                item.setName(candyEntity.getName());
            }
            if(candyEntity.getBarCode() != 0){
                item.setBarCode(candyEntity.getBarCode());
            }
            candyRepository.save(item);
        }
    }
}
