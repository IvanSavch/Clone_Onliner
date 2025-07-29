package onliner.entity.mobile;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.SplittableRandom;
@Entity
@Data
public class FrontCamera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String CameraMP;
    private String Specifications;
    private String maxVideoResolution;
}
