package io.bayrktlihn.shopme.backend.controller;

import io.bayrktlihn.shopme.backend.dto.CreateUserDto;
import io.bayrktlihn.shopme.backend.dto.UserDto;
import io.bayrktlihn.shopme.backend.service.RoleService;
import io.bayrktlihn.shopme.backend.service.TranslateService;
import io.bayrktlihn.shopme.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final RoleService roleService;
    private final TranslateService translateService;

    @GetMapping("")
    public String users(Model model) {
        List<UserDto> allUsers = userService.getAllUsers();
        model.addAttribute("users", allUsers);
        return "users";
    }

    @GetMapping("new")
    public String newUser(Model model) {
        UserDto user = UserDto.createActiveUser();

        model.addAttribute("translateService", translateService);
        model.addAttribute("pageTitle", translateService.instant("pageTitle.createNewUser"));
        model.addAttribute("roles", roleService.getAllRoles());
        model.addAttribute("user", user);

        return "user-form";
    }

    @PostMapping("create")
    public String create(CreateUserDto createUser) {
        userService.createUser(createUser);
        return "redirect:/users";
    }

}
