package com.ravi.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.emart.model.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {

}
