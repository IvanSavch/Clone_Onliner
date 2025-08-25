package onliner.entity;

import lombok.Data;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Data
@Table(name = "User_tb", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class User {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 8, message = "password must contain 8 characters")
    private String password;


}
