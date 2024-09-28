package com.example.Arcana.entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class CharacterClass extends  BaseEntity{

    @Column
    (name="Class_Name", nullable = false)
    private String name;

    @Column
    (nullable = false)
    private int hitDie;

    @Column
    (nullable = false)
    private List<String> proficiencies;

    @Column
    (nullable = false)
    private List <String> savingThrows;

    @Column
    private List <Equipment> equip;

    public CharacterClass () {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitDie() {
        return hitDie;
    }

    public void setHitDie(int hitDie) {
        this.hitDie = hitDie;
    }

    public List<String> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(List<String> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public List<String> getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(List<String> savingThrows) {
        this.savingThrows = savingThrows;
    }

    public List<Equipment> getEquip() {
        return equip;
    }

    public void setEquip(List<Equipment> equip) {
        this.equip = equip;
    }
}
