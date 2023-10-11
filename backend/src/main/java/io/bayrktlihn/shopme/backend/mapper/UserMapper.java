package io.bayrktlihn.shopme.backend.mapper;

import io.bayrktlihn.shopme.backend.dto.RoleDto;
import io.bayrktlihn.shopme.backend.dto.UserDto;
import io.bayrktlihn.shopme.common.entity.Role;
import io.bayrktlihn.shopme.common.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {


    @Mapping(source = "roles", target = "roles", qualifiedByName = "userRolesMapping")
    UserDto userToUserDto(User user);

    List<UserDto> userListToUserDtoList(List<User> users);

    @Named("userRolesMapping")
    static List<RoleDto> userRolesMapping(List<Role> roles) {
        return roles.stream().map(role -> new RoleDto(role.getId(), role.getName(), role.getDescription())).toList();
    }


}
