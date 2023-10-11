package io.bayrktlihn.shopme.backend.service;

import io.bayrktlihn.shopme.backend.dto.CreateUserDto;
import io.bayrktlihn.shopme.backend.dto.CreatedUserDto;
import io.bayrktlihn.shopme.backend.dto.UserDto;
import io.bayrktlihn.shopme.common.entity.User;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    CreatedUserDto createUser(CreateUserDto createUser);
}
