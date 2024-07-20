package com.aurelien.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurelien.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
