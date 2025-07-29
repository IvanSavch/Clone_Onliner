package onliner.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@MappedSuperclass
@NoArgsConstructor
public class AbstractEntityProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nameProduct;
    @NotNull
    private BigDecimal price;

    private byte[] img;
    @NotBlank
    private String description;
    @NotNull
    private long quantity;

    public AbstractEntityProduct(String nameProduct, BigDecimal price, byte[] img, String description, long quantity) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.img = img;
        this.description = description;
        this.quantity = quantity;
    }
}
