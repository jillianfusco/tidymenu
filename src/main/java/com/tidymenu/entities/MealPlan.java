package com.tidymenu.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class MealPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate;
    private Date endDate;

    @ManyToOne
    private User user;
}
