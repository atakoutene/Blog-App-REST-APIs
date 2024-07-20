package com.aurelien.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurelien.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
