package ua.lomatik.shopAPI.DBControllers;

import org.springframework.web.bind.annotation.*;
import ua.lomatik.shopAPI.DBEntities.Candy;
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
    public List<Candy> list() {
        return candyservice.getCandies();
    }

    @PostMapping(path = "add")
    public void addCandy(Candy candy) {
        candyservice.add(candy);
    }

    @DeleteMapping(path = "delete/{candyId}")
    public void deleteCandy(@PathVariable Long candyId) {
        candyservice.delete(candyId);
    }

    @PutMapping(path = "candy")
    public void deleteCandy(@RequestBody Candy candy) {
        candyservice.update(candy);
    }
}

