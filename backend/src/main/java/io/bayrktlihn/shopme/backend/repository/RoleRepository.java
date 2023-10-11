package io.bayrktlihn.shopme.backend.repository;

import io.bayrktlihn.shopme.common.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
