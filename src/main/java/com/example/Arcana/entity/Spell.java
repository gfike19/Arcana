package com.example.Arcana.entity;

import jakarta.persistence.*;

@Entity
public class Spell extends BaseEntity{

    @Column(name="spell_name", nullable = false)
    private String name;

    @Column
    private int level;

    @Column
    private String description;

    @Column
    private int higherLvlDieAmt;

    @Column
    private int higherLvlDie;

    @Column
    private int duration;

    @Column
    private boolean concentration;

    @Column
    private String castingTime;

    @Column
    private String damageType;

    @Column
    private String school;
    //TODO add playerClasses
    //private List<PlayerClass> classes;
    //subclasses

    public Spell() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHigherLvlDieAmt() {
        return higherLvlDieAmt;
    }

    public void setHigherLvlDieAmt(int higherLvlDieAmt) {
        this.higherLvlDieAmt = higherLvlDieAmt;
    }

    public int getHigherLvlDie() {
        return higherLvlDie;
    }

    public void setHigherLvlDie(int higherLvlDie) {
        this.higherLvlDie = higherLvlDie;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isConcentration() {
        return concentration;
    }

    public void setConcentration(boolean concentration) {
        this.concentration = concentration;
    }

    public String getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
