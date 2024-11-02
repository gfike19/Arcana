package com.example.Arcana.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Spell extends BaseEntity {

    @Column(name = "spell_name", nullable = false)
    @JsonProperty("name")
    private String name;

    @Column
    @JsonProperty("level")
    private int level;

    @Lob
    @JsonProperty("desc")
    private String description;

    @Lob
    @JsonProperty("higher_level")
    private String higherLevel;

    @Column
    @JsonProperty("duration")
    private String duration;

    @Column
    @JsonProperty("concentration")
    private boolean concentration;

    @Column
    @JsonProperty("casting_time")
    private String castingTime;

    @Column
    @JsonProperty("spell_range")
    private String spellRange;

    @Lob
    @JsonProperty("components")
    private String components;

//    @Column
//    @JsonProperty("material")
//    private String material;

    @Column
    @JsonProperty("damage_type")
    private String damageType;

    @Lob
    @JsonProperty("damage_at_slot_level")
    private String damageAtSlotLevel;

    @Column
    @JsonProperty("school")
    private String school;

    //TODO add playerClasses
    //private List<PlayerClass> classes;
    //subclasses

    public Spell() {
        super();
    }

    // Getter and Setter Methods

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

    public String getHigherLevel() {
        return higherLevel;
    }

    public void setHigherLevel(String higherLevel) {
        this.higherLevel = higherLevel;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
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

    public String getSpellRange() {
        return spellRange;
    }

    public void setRange(String range) {
        this.spellRange = spellRange;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

//    public String getMaterial() {
//        return material;
//    }
//
//    public void setMaterial(String material) {
//        this.material = material;
//    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getDamageAtSlotLevel() {
        return damageAtSlotLevel;
    }

    public void setDamageAtSlotLevel(String damageAtSlotLevel) {
        this.damageAtSlotLevel = damageAtSlotLevel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
