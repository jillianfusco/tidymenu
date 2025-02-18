package com.tidymenu.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class GroceryList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private MealPlan generatedFromMealPlan;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

}
