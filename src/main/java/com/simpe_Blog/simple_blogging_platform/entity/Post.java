package com.simpe_Blog.simple_blogging_platform.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name="post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private  String title;
    private  String content;

    private User user;

    @ElementCollection
    private Set<Category> categories=new HashSet<>();

    @ElementCollection
    private List<Comment> Comments=new ArrayList<>();

}
