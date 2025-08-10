package onliner.entity.mobile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcessorMobile{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String platform;
    private String processorClockSpeed;
    private String numberOfCores;
    private String processorBitDepth;

    @OneToMany(mappedBy = "processor")
    private List<Mobile> mobile;

    public ProcessorMobile(String model, String platform, String processorClockSpeed, String numberOfCores, String processorBitDepth) {
        this.model = model;
        this.platform = platform;
        this.processorClockSpeed = processorClockSpeed;
        this.numberOfCores = numberOfCores;
        this.processorBitDepth = processorBitDepth;
    }

}
