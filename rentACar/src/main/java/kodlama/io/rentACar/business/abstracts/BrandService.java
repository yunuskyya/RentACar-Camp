package kodlama.io.rentACar.business.abstracts;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRuquest;

import java.util.List;

public interface BrandService {
    List<GetAllBrandResponse>getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);

    void update(UpdateBrandRuquest updateBrandRuquest);
    void delete(int id);



}
