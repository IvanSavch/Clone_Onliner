package onliner.entity.mobile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelCamera;
    private String mainCamera;
    private String ultraWide;
    private String telephoto;
    private String frontCamera;
    private String numberOfCameraModules;

    @OneToMany(mappedBy = "camera")
    private List <Mobile> mobile;

    public Camera(String modelCamera, String mainCamera, String ultraWide, String telephoto, String frontCamera, String numberOfCameraModules) {
        this.modelCamera = modelCamera;
        this.mainCamera = mainCamera;
        this.ultraWide = ultraWide;
        this.telephoto = telephoto;
        this.frontCamera = frontCamera;
        this.numberOfCameraModules = numberOfCameraModules;
    }
}
