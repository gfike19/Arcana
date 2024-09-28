package com.example.Arcana.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.*;

@Entity
public class Weapon extends Equipment{

    @Column
    (nullable = false)
    private String weaponCategory;

    @Column(nullable = false)
    private String damageType;

    @Column
    (nullable = false)
    private Pair <Integer, Integer> damageDice;

    @Column
    private boolean versatile;

    @Column
    private Pair <Integer, Integer> twoHandedDamage;

    @Column
    private boolean finesse;

    @Column
    private boolean light;

    @Column
    private boolean isAMonkWeapon;

    public Weapon () {
        super();
    }
}
