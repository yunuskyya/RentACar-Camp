package kodlama.io.rentACar.business.abstracts;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
import kodlama.io.rentACar.business.ruquests.CreateBrandRuquest;
import java.util.List;

public interface BrandService {
    List<GetAllBrandResponse>getAll();
    void add(CreateBrandRuquest createBrandRuquest);
}
