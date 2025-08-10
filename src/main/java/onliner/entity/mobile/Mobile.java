package onliner.entity.mobile;

import lombok.Data;
import onliner.entity.AbstractEntityProduct;
import onliner.entity.Shop;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Mobile extends AbstractEntityProduct {

    private String length;
    private String width;
    private String thickness;
    private String weight;
    private String color;
    private String os;

    @ManyToOne(cascade = CascadeType.ALL)
    private Camera camera;
    @ManyToOne(cascade = CascadeType.ALL )
    private ProcessorMobile processor;
    @ManyToOne(cascade = CascadeType.ALL)
    private Screen screen;
    @OneToOne
    private Shop shop;


    public Mobile(String brand, String model, BigDecimal price, byte[] img, String description, long quantity, String length, String width, String thickness, String weight, String color, String os, Camera camera, ProcessorMobile processor, Screen screen) {
        super(brand, model, price, img, description, quantity);
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.weight = weight;
        this.color = color;
        this.os = os;
        this.camera = camera;
        this.processor = processor;
        this.screen = screen;
    }

    public Mobile() {

    }

}
