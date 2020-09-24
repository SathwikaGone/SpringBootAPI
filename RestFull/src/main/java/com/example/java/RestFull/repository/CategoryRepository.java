package com.example.java.RestFull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.RestFull.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findByName(String name);
}
