package com.buylive.persist;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.buylive.domain.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, Long> {

}
