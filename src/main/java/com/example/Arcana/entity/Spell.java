package com.example.Arcana.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Spell extends BaseEntity{

    @Column(name="spell_name", nullable = false)
    @JsonProperty("name")
    private String name;

    @Column
    @JsonProperty("level")
    private int level;

    @Column
    @JsonProperty("desc")
    private String description;

    @JsonProperty("higher_level")
    public void setHigherLevel(String[] higherLevel) {
        if (higherLevel != null && higherLevel.length > 0) {
            String dieAmountText = higherLevel[0].split(" ")[-2];
            this.higherLvlDieAmt = Integer.parseInt(dieAmountText.split("d")[0]);
            this.higherLvlDie = Integer.parseInt(dieAmountText.split("d")[1]);
        } else {
            this.higherLvlDieAmt = 0;
            this.higherLvlDie = 0;
        }
    }

    @Column
    private int higherLvlDieAmt;

    @Column
    private int higherLvlDie;

    @Column
    @JsonProperty("duration")
    private int duration;

    @Column
    @JsonProperty("concentration")
    private boolean concentration;

    @Column
    @JsonProperty("casting_time")
    private String castingTime;

    @Column
    @JsonProperty("damage")
    private String damageType;

    @Column
    @JsonProperty("school")
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
