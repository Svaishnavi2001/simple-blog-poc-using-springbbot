package com.simpe_Blog.simple_blogging_platform.service;

import com.simpe_Blog.simple_blogging_platform.entity.Comment;
import com.simpe_Blog.simple_blogging_platform.entity.Post;
import com.simpe_Blog.simple_blogging_platform.respository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }

    public Optional<Comment> getCommentById(Long id){
        return commentRepository.findById(id);
    }

    public List<Comment> getCommentByPost(Post post){
        return commentRepository.findByPost(post);
    }

    public Comment saveComment(Comment comment){
        return commentRepository.save(comment);
    }

    public void deleteComment(Long id){
        commentRepository.deleteById(id);
    }

}
