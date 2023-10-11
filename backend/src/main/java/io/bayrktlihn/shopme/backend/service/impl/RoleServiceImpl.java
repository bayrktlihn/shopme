package io.bayrktlihn.shopme.backend.service.impl;

import io.bayrktlihn.shopme.backend.dto.RoleDto;
import io.bayrktlihn.shopme.backend.mapper.RoleMapper;
import io.bayrktlihn.shopme.backend.repository.RoleRepository;
import io.bayrktlihn.shopme.backend.service.RoleService;
import io.bayrktlihn.shopme.common.entity.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    @Override
    public List<RoleDto> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        return roleMapper.roleListToRoleDtoList(roles);
    }
}
