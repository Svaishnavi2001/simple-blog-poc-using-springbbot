package com.simpe_Blog.simple_blogging_platform.respository;

import com.simpe_Blog.simple_blogging_platform.entity.Post;
import com.simpe_Blog.simple_blogging_platform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findByUser(User user);
}
