package com.simpe_Blog.simple_blogging_platform.respository;

import com.simpe_Blog.simple_blogging_platform.entity.Category;
import com.simpe_Blog.simple_blogging_platform.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long>{

    List<Category> findByComment(Comment comment);
}
