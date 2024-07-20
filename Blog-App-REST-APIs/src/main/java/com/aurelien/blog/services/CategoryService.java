package com.aurelien.blog.services;

import java.util.List;

import com.aurelien.blog.payloads.CategoryDto;

public interface CategoryService {

	CategoryDto createCategory(CategoryDto categoryDto);
	
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	void deleteCategory(Integer categoryId);
	
	List<CategoryDto> getAllCategories();
	
	CategoryDto getCategoryById(Integer categoryId);
}
