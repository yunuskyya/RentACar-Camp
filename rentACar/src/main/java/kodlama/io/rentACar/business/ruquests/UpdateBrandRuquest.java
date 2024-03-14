package kodlama.io.rentACar.business.ruquests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRuquest {
    private int id;
    private String name;

}
