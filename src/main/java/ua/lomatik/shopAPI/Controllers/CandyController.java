package ua.lomatik.shopAPI.Controllers;

import org.springframework.web.bind.annotation.*;
import ua.lomatik.shopAPI.DBEntities.CandyEntity;
import ua.lomatik.shopAPI.DBServices.CandyService;

import java.util.List;

@RestController
@RequestMapping("v1/candies")
public class CandyController {

    private final CandyService candyservice;

    public CandyController(CandyService candyservice) {
        this.candyservice = candyservice;
    }

    @GetMapping(path = "list")
    public List<CandyEntity> list() {
        return candyservice.getCandies();
    }

    @PostMapping(path = "add")
    public void addCandyRequest(CandyEntity candyEntity) {
        candyservice.add(candyEntity);
    }

    @DeleteMapping(path = "delete/{candyId}")
    public void deleteCandyRequest(@PathVariable Long candyId) {
        candyservice.delete(candyId);
    }

    @PutMapping(path = "update")
    public void updateCandyRequest(@RequestBody CandyEntity candyEntity) {
        candyservice.update(candyEntity);
    }
}

