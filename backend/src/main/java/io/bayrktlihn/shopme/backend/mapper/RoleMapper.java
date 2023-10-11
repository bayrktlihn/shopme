package io.bayrktlihn.shopme.backend.mapper;

import io.bayrktlihn.shopme.backend.dto.RoleDto;
import io.bayrktlihn.shopme.common.entity.Role;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    List<RoleDto> roleListToRoleDtoList(List<Role> roles);

}
