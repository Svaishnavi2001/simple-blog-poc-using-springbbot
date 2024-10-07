package com.simpe_Blog.simple_blogging_platform.controller;

import com.simpe_Blog.simple_blogging_platform.entity.Category;
import com.simpe_Blog.simple_blogging_platform.entity.Comment;
import com.simpe_Blog.simple_blogging_platform.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getALlCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    @GetMapping("/{comment}")
    public List<Category> getCategoryByComment(@PathVariable Comment comment){
        return categoryService.getCategoryByComment(comment);
    }

    @PostMapping("/addCategory")
    public Category CreateCategory(@RequestBody Category  category){
        return categoryService.savecategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }
}
