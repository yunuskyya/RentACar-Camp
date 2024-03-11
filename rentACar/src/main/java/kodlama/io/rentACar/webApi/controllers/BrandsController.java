package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
import kodlama.io.rentACar.business.ruquests.CreateBrandRuquest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {


    private BrandService brandService;

    @GetMapping("getAll")
    public List<GetAllBrandResponse> getAll(){
        return brandService.getAll();
    }
    @PostMapping("/add")
    public void add(CreateBrandRuquest createBrandRuquest){
        this.brandService.add(createBrandRuquest);

    }

}
