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
public class Dwarves extends Race{

    @Override
    public void initCharacter() {       
        System.out.println("Now inside Dwarves::initCharacter()");   
        
        // Set some predefined specs for Dwarves.
        setSubspecies("Polevik");
        setLanguage("Common Language, Dwarvish");
        setLocation("Mahakam");
        setLifeSpan(180);
    }
}
