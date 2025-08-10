package onliner.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class MobileDto {

    private String brand;
    private String model;
    private BigDecimal price;
    private byte[] img;
    private String description;
    private long quantity;

    private String length;
    private String width;
    private String thickness;
    private String weight;
    private String color;
    private String os;

    private String modelCamera;
    private String mainCamera;
    private String ultraWide;
    private String telephoto;
    private String frontCamera;
    private String numberOfCameraModules;

    private String modelProcessor;
    private String platform;
    private String processorClockSpeed;
    private String numberOfCores;
    private String processorBitDepth;

    private String modelScreen;
    private String numberOfScreenColors;
    private String screenResolution;
    private String aspectRatio;
    private String scratchProtection;

}
