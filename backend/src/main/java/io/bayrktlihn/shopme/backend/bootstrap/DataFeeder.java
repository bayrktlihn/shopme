package io.bayrktlihn.shopme.backend.bootstrap;

import io.bayrktlihn.shopme.backend.repository.RoleRepository;
import io.bayrktlihn.shopme.backend.repository.UserRepository;
import io.bayrktlihn.shopme.common.entity.Role;
import io.bayrktlihn.shopme.common.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class DataFeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        populateRoles();

        List<Role> alihanRoles = roleRepository.findAllById(List.of(1L));
        userRepository.save(new User("alihan.bayraktar@bayrktlihn.io", "bayrktlihn", "alihan", "bayraktar", alihanRoles));

        List<Role> muratRoles = roleRepository.findAllById(List.of(2L, 5L));
        userRepository.save(new User("murat.yildiz@bayrktlihn.io", "test", "murat", "yildiz", muratRoles));
    }

    private void populateRoles() {
        roleRepository.save(new Role("Admin", "manage everything"));
        roleRepository.save(new Role("Salesperson", "manage product price, customers"));
        roleRepository.save(new Role("Editor", "manage categories, brands, products, articles"));
        roleRepository.save(new Role("Shipper", "view products, view orders and update order"));
        roleRepository.save(new Role("Assistant", "manage questions and reviews"));
    }
}
