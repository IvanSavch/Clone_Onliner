package onliner.entity.mobile;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Entity
@Data
public class ProcessorMobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String platform;
    private String name;
    private String processorClockSpeed;
    private  String numberOfCores;
    private String processorBitDepth;

}
