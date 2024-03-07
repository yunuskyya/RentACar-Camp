package kodlama.io.rentACar.entities.concretes;

public class Brand {
    private int id;
    private String name;


    public Brand(int id, String renault) {
        this.id = id;
    }

    public Brand(String name) {
        this.name = name;
    }

    public Brand() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
