package com.example.Arcana.entity;

import jakarta.persistence.*;
import org.springframework.data.util.Pair;

@Entity
public class Weapon extends Equipment{

    @Column
    (nullable = false)
    private String weaponCategory;

    @Column(nullable = false)
    private String damageType;
//TODO need to fix
//    @Column
//    (nullable = false)
//    private Pair<Integer, Integer> damageDice;

    @Column
    private boolean versatile;

//    @Column
//    private Pair <Integer, Integer> twoHandedDamage;

    @Column
    private boolean finesse;

    @Column
    private boolean light;

    @Column
    private boolean isAMonkWeapon;

    public Weapon () {
        super();
    }

    public String getWeaponCategory() {
        return weaponCategory;
    }

    public void setWeaponCategory(String weaponCategory) {
        this.weaponCategory = weaponCategory;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public boolean isVersatile() {
        return versatile;
    }

    public void setVersatile(boolean versatile) {
        this.versatile = versatile;
    }

    public boolean isFinesse() {
        return finesse;
    }

    public void setFinesse(boolean finesse) {
        this.finesse = finesse;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public boolean isAMonkWeapon() {
        return isAMonkWeapon;
    }

    public void setAMonkWeapon(boolean AMonkWeapon) {
        isAMonkWeapon = AMonkWeapon;
    }
}
