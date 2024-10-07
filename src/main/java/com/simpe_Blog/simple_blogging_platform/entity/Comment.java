package com.simpe_Blog.simple_blogging_platform.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String content;

    @ManyToOne
    @JoinColumn(name="post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


}
