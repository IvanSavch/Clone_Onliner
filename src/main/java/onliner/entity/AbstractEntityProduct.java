package onliner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@MappedSuperclass
@NoArgsConstructor
@Data
public abstract class AbstractEntityProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String model;
    @NotNull
    private BigDecimal price;

    private byte[] img;
    @NotNull
    private long quantity;

    public AbstractEntityProduct(String model, BigDecimal price, byte[] img, long quantity) {
        this.model = model;
        this.price = price;
        this.img = img;
        this.quantity = quantity;
    }
}
