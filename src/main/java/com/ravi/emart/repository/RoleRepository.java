package com.naveen.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.emart.model.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {

}
