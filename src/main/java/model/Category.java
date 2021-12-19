package model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  long id;
    private String name;

    @OneToMany(targetEntity = Product.class)
    private List<Product> products;
    public Category() {
    }

    public long getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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
