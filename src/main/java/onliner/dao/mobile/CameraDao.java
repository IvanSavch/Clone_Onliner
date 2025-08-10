package onliner.dao.mobile;

import onliner.entity.mobile.Camera;

public interface CameraDao {
    Camera findByModelCamera(String model);
}
