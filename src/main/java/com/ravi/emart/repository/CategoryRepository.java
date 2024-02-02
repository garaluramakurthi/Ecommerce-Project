package com.ravi.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.emart.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
