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
public class Humans extends Race {

    @Override
    public void initCharacter() {
        System.out.println("Now inside Humans::initCharacter()");
        
        // Set some predefined specs for Humans.
        setSubspecies("Witchers");
        setLanguage("Common Language");
        setLocation("All of the known World");
        setLifeSpan(75);
    }
}
