package com.simpe_Blog.simple_blogging_platform.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;


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
    private List<Category> categories;

    @ElementCollection
    private List<Comment> Comments;

}
