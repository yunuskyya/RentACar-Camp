package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="models")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Model {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
