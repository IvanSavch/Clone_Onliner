package onliner.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class MobileDto {

    private String nameProduct;
    private BigDecimal price;
    private byte[] img;
    private String description;
    private long quantity;

    private String housingConstruction;
    private String stereoSpeakers;
    private String materialOfEdges;
    private String backCoverMaterial;
    private String colorOfEdges;
    private String backCoverColor;
    private String frontPanelColor;
    private String length;
    private String width;
    private String thickness;
    private String weight;
    private String cameraMP;
    private String specifications;
    private String maxVideoResolution;
    private String builtInCamera;
    private String numberOfCameraModules;
    private String cameraModules;
    private String platform;
    private String name;
    private String processorClockSpeed;
    private String numberOfCores;
    private String processorBitDepth;
    private String numberOfScreenColors;
    private String screenResolution;
    private String aspectRatio;
    private String scratchProtection;

}
