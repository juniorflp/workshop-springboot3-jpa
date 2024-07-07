package com.educandoweb.course.resources.repositories;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
