package com.example.lostpets.repositories;

import com.example.lostpets.models.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
