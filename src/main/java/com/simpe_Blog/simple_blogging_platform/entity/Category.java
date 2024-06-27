package com.simpe_Blog.simple_blogging_platform.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name="comment_id")
    private  Comment comment;

    @ManyToMany
    private Set<Post> posts=new HashSet<>();


}
