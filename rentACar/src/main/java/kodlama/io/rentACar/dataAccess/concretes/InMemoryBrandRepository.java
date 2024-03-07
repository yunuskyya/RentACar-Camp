package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMV"));
        brands.add(new Brand(2, "Audi"));
        brands.add(new Brand(3, "Merdeces"));
        brands.add(new Brand(4, "Fiat"));
        brands.add(new Brand(5, "Renault"));
    }

    public List<Brand> getAll() {
        return brands;
    }
}
