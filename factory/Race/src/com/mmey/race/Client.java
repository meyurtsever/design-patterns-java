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
public class Client {
 
    public static void main(String[] args) {
        RaceFactory raceFactory = new RaceFactory();
        
        Race race1 = raceFactory.getRace("ELVES");
        race1.initCharacter();
        race1.displayRace();
        
        Race race2 = raceFactory.getRace("HUMANS");
        race2.initCharacter();
        race2.displayRace();
        
        Race race3 = raceFactory.getRace("DWARVES");
        race3.initCharacter();
        race3.displayRace();
    }
}
