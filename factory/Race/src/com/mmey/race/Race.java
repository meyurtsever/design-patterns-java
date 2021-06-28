/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmey.race;

/**
 *
 * @author Yurtsever
 */
public abstract class Race {
    
    private String subspecies;
    private String language;
    private String location;
    private int lifeSpan;
    
    public abstract void initCharacter();
    
    public void displayRace() {
        System.out.println("");
        System.out.println("Subspecies: " + getSubspecies());
        System.out.println("Language(s): " + getLanguage());
        System.out.println("Location(s): " + getLocation());
        System.out.println("Average Life Span: " + getLifeSpan());
        System.out.println("-----------------");
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
