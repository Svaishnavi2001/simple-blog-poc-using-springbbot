package com.simpe_Blog.simple_blogging_platform.controller;

import com.simpe_Blog.simple_blogging_platform.entity.Post;
import com.simpe_Blog.simple_blogging_platform.entity.User;
import com.simpe_Blog.simple_blogging_platform.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping( "/{id}")
    public Optional<Post> getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @GetMapping("/{user}")
    public List<Post> getPostByUSer(@PathVariable User user) {
        return postService.getPostByUSer(user);
    }

    @PostMapping("/addPost")
    public Post createPost(@RequestBody  Post post) {
        return postService.savePost(post);
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post postDetails) {
        Optional<Post> optPost = postService.getPostById(id);
        Post existingPost= optPost.get();
        existingPost.setTitle(postDetails.getTitle());
        existingPost.setContent(postDetails.getContent());

        return postService.savePost(existingPost);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id){
        postService.deletePost(id);
    }
}
