package com.simpe_Blog.simple_blogging_platform.controller;

import com.simpe_Blog.simple_blogging_platform.entity.Comment;
import com.simpe_Blog.simple_blogging_platform.entity.Post;
import com.simpe_Blog.simple_blogging_platform.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> getAllComments(){
       return commentService.getAllComments() ;
    }

    @GetMapping( "/{id}")
    public Comment getCommentById(@PathVariable Long id){
        return commentService.getCommentById(id).get();
    }

    @GetMapping("/{post}")
    public List<Comment> getCommentByPost(@PathVariable Post post){
        return commentService.getCommentByPost(post);
    }

    @PostMapping("/addComment")
    public Comment createComment(@RequestBody Comment comment){
          return commentService.saveComment(comment);
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable Long id, @RequestBody Comment commentDetails){
        Optional<Comment> optComment=commentService.getCommentById(id);
        Comment existingComment=optComment.get();
        existingComment.setContent(commentDetails.getContent());
        return commentService.saveComment(existingComment);
    }
    @DeleteMapping( "/{id}")
    public void deleteComment(@PathVariable Long id){
        commentService.deleteComment(id);
    }
}
