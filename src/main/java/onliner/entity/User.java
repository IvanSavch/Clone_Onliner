package onliner.entity;

import lombok.Data;

import onliner.common.Role;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "User_tb", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class User {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    @NotBlank
    private String name;

    @NotNull
    @NotEmpty
    @NotBlank
    private String password;
    private Role role;
    private byte[] img;


}
