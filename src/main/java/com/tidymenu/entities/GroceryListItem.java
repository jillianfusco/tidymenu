package com.tidymenu.entities;

import jakarta.persistence.*;

@Entity
public class GroceryListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private GroceryList groceryList;

    @ManyToOne
    private Ingredient ingredient;

    private double quantity;
    private String unit;
    private boolean isChecked;
}
