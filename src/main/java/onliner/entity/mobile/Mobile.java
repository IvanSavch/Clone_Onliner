package onliner.entity.mobile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import onliner.entity.AbstractEntityProduct;
import onliner.entity.Shop;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Data
@Entity
public class Mobile extends AbstractEntityProduct {
    @OneToOne
    private Construction construction;
    @OneToOne
    private DimensionsAndWeight dimensionsAndWeight;
    @OneToOne
    private FrontCamera frontCamera;
    @OneToOne
    private MainCamera mainCamera;
    @OneToOne
    private ProcessorMobile processor;
    @OneToOne
    private Screen screen;
    @OneToOne
    private Shop shop;



    public Mobile(String nameProduct, BigDecimal price, byte[] img, String description, long quantity, Construction construction, DimensionsAndWeight dimensionsAndWeight, FrontCamera frontCamera, MainCamera mainCamera, ProcessorMobile processor, Screen screen) {
        super(nameProduct, price, img, description, quantity);
        this.construction = construction;
        this.dimensionsAndWeight = dimensionsAndWeight;
        this.frontCamera = frontCamera;
        this.mainCamera = mainCamera;
        this.processor = processor;
        this.screen = screen;

    }

    public Mobile() {

    }


}
