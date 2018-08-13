package com.example.springboot_20;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends CrudRepository<User, Long> {

    Role findByRole(String role);
}
