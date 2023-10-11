package io.bayrktlihn.shopme.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<RoleDto> roles = new ArrayList<>();
    private Boolean active;

    public static UserDto createActiveUser() {
        UserDto userDto = new UserDto();
        userDto.setActive(Boolean.TRUE);
        return userDto;
    }


}
