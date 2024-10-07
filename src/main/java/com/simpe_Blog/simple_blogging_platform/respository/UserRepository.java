package com.simpe_Blog.simple_blogging_platform.respository;

import com.simpe_Blog.simple_blogging_platform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

     User findByUsername(String username);
}
