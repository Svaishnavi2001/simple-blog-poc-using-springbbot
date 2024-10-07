package com.simpe_Blog.simple_blogging_platform.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Data
@Table(name = "category")
public class Category  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name="comment_id")
    private  Comment comment;

    @ManyToMany
    private List<Post> posts;


}
