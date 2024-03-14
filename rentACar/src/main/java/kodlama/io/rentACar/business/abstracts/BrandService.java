package kodlama.io.rentACar.business.abstracts;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.ruquests.CreateBrandRuquest;
import kodlama.io.rentACar.business.ruquests.UpdateBrandRuquest;

import java.util.List;

public interface BrandService {
    List<GetAllBrandResponse>getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRuquest createBrandRuquest);

    void update(UpdateBrandRuquest updateBrandRuquest);
    void delete(int id);


}
