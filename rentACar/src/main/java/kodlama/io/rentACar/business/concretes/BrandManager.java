package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
import kodlama.io.rentACar.business.ruquests.CreateBrandRuquest;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;


    @Override
    public List<GetAllBrandResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandResponse> brandsResponse =new ArrayList<GetAllBrandResponse>();
        for (Brand brand : brands){
            GetAllBrandResponse responseItem = new GetAllBrandResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponse.add(responseItem);
        }
        //iş kuralları
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRuquest createBrandRuquest) {
        Brand brand = new Brand();
        brand.setName(createBrandRuquest.getName());

        this.brandRepository.save(brand);
    }
}
