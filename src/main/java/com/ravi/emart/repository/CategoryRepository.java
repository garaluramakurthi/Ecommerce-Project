package com.naveen.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.emart.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
