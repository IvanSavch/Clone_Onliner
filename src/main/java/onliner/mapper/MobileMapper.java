package onliner.mapper;

import onliner.dto.MobileDto;
import onliner.entity.mobile.*;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class MobileMapper {

    public Mobile toMobile(MobileDto dto) {
        Construction construction = new Construction();
        construction.setMaterialOfEdges(dto.getMaterialOfEdges());
        construction.setStereoSpeakers(dto.getStereoSpeakers());
        construction.setHousingConstruction(dto.getHousingConstruction());
        construction.setFrontPanelColor(dto.getFrontPanelColor());
        construction.setColorOfEdges(dto.getColorOfEdges());
        construction.setBackCoverColor(dto.getBackCoverColor());
        construction.setBackCoverMaterial(dto.getBackCoverMaterial());

        DimensionsAndWeight dimensionsAndWeight = new DimensionsAndWeight();
        dimensionsAndWeight.setWeight(dto.getWeight());
        dimensionsAndWeight.setLength(dto.getLength());
        dimensionsAndWeight.setThickness(dto.getThickness());
        dimensionsAndWeight.setWidth(dto.getWidth());

        FrontCamera frontCamera = new FrontCamera();
        frontCamera.setCameraMP(dto.getCameraMP());
        frontCamera.setSpecifications(dto.getSpecifications());
        frontCamera.setMaxVideoResolution(dto.getMaxVideoResolution());

        MainCamera mainCamera = new MainCamera();
        mainCamera.setCameraModules(dto.getCameraModules());
        mainCamera.setBuiltInCamera(dto.getBuiltInCamera());
        mainCamera.setNumberOfCameraModules(dto.getNumberOfCameraModules());

        ProcessorMobile processorMobile = new ProcessorMobile();
        processorMobile.setProcessorBitDepth(dto.getProcessorBitDepth());
        processorMobile.setName(dto.getName());
        processorMobile.setProcessorClockSpeed(dto.getProcessorClockSpeed());
        processorMobile.setPlatform(dto.getPlatform());
        processorMobile.setNumberOfCores(dto.getNumberOfCores());

        Screen screen = new Screen();
        screen.setNumberOfScreenColors(dto.getNumberOfScreenColors());
        screen.setScreenResolution(dto.getScreenResolution());
        screen.setAspectRatio(dto.getAspectRatio());
        screen.setScratchProtection(dto.getScratchProtection());

    return new Mobile(dto.getNameProduct(),
            dto.getPrice(),
            dto.getImg(),
            dto.getDescription(),
            dto.getQuantity(),
            construction,
            dimensionsAndWeight,
            frontCamera,
            mainCamera,
            processorMobile,
            screen);
    }
}
