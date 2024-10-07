package com.simpe_Blog.simple_blogging_platform.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;
    private String password;
    private String email;
}
