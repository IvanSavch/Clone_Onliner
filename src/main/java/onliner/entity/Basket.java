package onliner.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal price;
    private String name;

    @OneToOne
    private User user;

    public Basket(BigDecimal price, String name, User user) {
        this.price = price;
        this.name = name;
        this.user = user;
    }

    public Basket() {

    }
}
