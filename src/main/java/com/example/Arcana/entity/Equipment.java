package com.example.Arcana.entity;

import jakarta.persistence.*;


public class Equipment extends BaseEntity{

    @Column
    (name="Equipment_Name", nullable = false)
    public String name;

    @Column
    (nullable = false)
    public int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
