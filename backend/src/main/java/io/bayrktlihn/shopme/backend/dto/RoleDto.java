package io.bayrktlihn.shopme.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoleDto {

    private Long id;
    private String name;
    private String description;

    public RoleDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public RoleDto(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
