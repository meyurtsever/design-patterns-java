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
public class Elves extends Race {
    
    @Override
    public void initCharacter() {      
        System.out.println("Now inside Elves::initCharacter()");   
        
        // Set some predefined specs for Elves.
        setSubspecies("Quarter-elves");
        setLanguage("Common Speech");
        setLocation("Blue Mountains, Nilfgaardian Empire");
        setLifeSpan(350);
    }
    
    
}
