package onliner.entity.mobile;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelScreen;
    private String numberOfScreenColors;
    private String screenResolution;
    private String aspectRatio;
    private String scratchProtection;

    @OneToMany(mappedBy = "screen")
    private List<Mobile> mobile;

    public Screen(String modelScreen, String numberOfScreenColors, String screenResolution, String aspectRatio, String scratchProtection) {
        this.modelScreen = modelScreen;
        this.numberOfScreenColors = numberOfScreenColors;
        this.screenResolution = screenResolution;
        this.aspectRatio = aspectRatio;
        this.scratchProtection = scratchProtection;
    }
}
