package io.bayrktlihn.shopme.backend.service.impl;

import io.bayrktlihn.shopme.backend.dto.CreateUserDto;
import io.bayrktlihn.shopme.backend.dto.CreatedUserDto;
import io.bayrktlihn.shopme.backend.dto.UserDto;
import io.bayrktlihn.shopme.backend.mapper.UserMapper;
import io.bayrktlihn.shopme.backend.repository.UserRepository;
import io.bayrktlihn.shopme.backend.service.UserService;
import io.bayrktlihn.shopme.common.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return userMapper.userListToUserDtoList(users);
    }

    @Override
    public CreatedUserDto createUser(CreateUserDto createUser) {

        if (userRepository.findByEmail(createUser.getEmail()).isPresent()) {

        }



        User user = new User(createUser.getEmail(), createUser.getPassword(), createUser.getFirstName(), createUser.getLastName());
        User savedUser = userRepository.save(user);
        return null;
    }
}
