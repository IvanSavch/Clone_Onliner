package onliner.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank(message = "Passport cannot be empty")
    @Size(min = 10, message = "Check your passport number")
    private String passportNumber;
    @NotBlank
    private String nameShop;
    @NotBlank
    private String address;
    @NotBlank
    private String mobileNumber;

}
