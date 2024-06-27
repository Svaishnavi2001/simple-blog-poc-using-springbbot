package com.simpe_Blog.simple_blogging_platform.service;

import com.simpe_Blog.simple_blogging_platform.entity.Category;
import com.simpe_Blog.simple_blogging_platform.entity.Comment;
import com.simpe_Blog.simple_blogging_platform.respository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Long id){
        return categoryRepository.findById(id);
    }

    public List<Category> getCategoryByComment(Comment comment){
        return categoryRepository.findByComment(comment);
    }

    public Category savecategory(Category category){
        return categoryRepository.save(category);
   }
    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
   }


}
