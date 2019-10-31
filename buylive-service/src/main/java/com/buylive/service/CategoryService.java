package com.buylive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buylive.domain.Category;
import com.buylive.persist.CategoryRepository;

@Service
public class CategoryService implements CrudService<Category> {
	
	@Autowired
	private CategoryRepository repository;

	@Override
	public Category create(Category category) {
		return repository.save(category);
	}

}
