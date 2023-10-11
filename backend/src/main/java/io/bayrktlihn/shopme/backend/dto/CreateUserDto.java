package io.bayrktlihn.shopme.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserDto {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean active;

}
