package onliner.mapper;

import onliner.dto.MobileDto;
import onliner.entity.mobile.*;
import org.springframework.stereotype.Component;

@Component
public class MobileMapper {

    public static Mobile toMobile(MobileDto dto) {
        Camera camera = new Camera();
        camera.setMainCamera(dto.getMainCamera());
        return new Mobile();
    }
}