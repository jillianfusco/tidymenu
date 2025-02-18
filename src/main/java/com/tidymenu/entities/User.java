package com.tidymenu.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String passwordHash;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
}
