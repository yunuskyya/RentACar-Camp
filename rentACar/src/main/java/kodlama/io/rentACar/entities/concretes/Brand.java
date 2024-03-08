package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name="brands")
@Data
@AllArgsConstructor
public class Brand {
    private int id;
    private String name;

}
