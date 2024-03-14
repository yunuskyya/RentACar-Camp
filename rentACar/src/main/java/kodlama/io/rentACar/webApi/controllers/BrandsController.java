package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.ruquests.CreateBrandRuquest;
import kodlama.io.rentACar.business.ruquests.UpdateBrandRuquest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {


    private BrandService brandService;

    @GetMapping()
    public List<GetAllBrandResponse> getAll(){
        return brandService.getAll();
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody() CreateBrandRuquest createBrandRuquest){
        this.brandService.add(createBrandRuquest);

    }
    @GetMapping("{id}")
    public GetByIdBrandResponse getById(@PathVariable int id){
        return brandService.getById(id);
    }
    @PutMapping
    public void update(@RequestBody() UpdateBrandRuquest updateBrandRuquest){
        this.brandService.update(updateBrandRuquest);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        this.brandService.delete(id);
    }


}
