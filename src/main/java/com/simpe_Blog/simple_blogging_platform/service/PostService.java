package com.simpe_Blog.simple_blogging_platform.service;


import com.simpe_Blog.simple_blogging_platform.entity.Post;
import com.simpe_Blog.simple_blogging_platform.entity.User;
import com.simpe_Blog.simple_blogging_platform.respository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class PostService  {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Long id ){
        return postRepository.findById(id);
    }

    public List<Post> getPostByUSer(User user){
        return postRepository.findByUser(user);
    }

    public Post savePost(Post post){
        return postRepository.save(post);
    }

    public void deletePost(Long id){
        postRepository.deleteById(id);
    }

}
