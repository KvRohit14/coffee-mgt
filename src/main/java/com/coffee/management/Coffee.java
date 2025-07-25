package com.coffee.management;

import javax.persistence.*;

@Entity
@Table(name = "coffees")
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String origin;

    public Coffee() {}

    public Coffee(String name, double price, String origin) {
        this.name = name;
        this.price = price;
        this.origin = origin;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }
} 