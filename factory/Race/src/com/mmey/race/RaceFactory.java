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
public class RaceFactory {
    
    public Race getRace(String raceType) {
        if(raceType == null) {
            return null;
        }
        if (raceType.equalsIgnoreCase("ELVES")) {
            return new Elves();
        } else if (raceType.equalsIgnoreCase("HUMANS")) {
            return new Humans();
        } else if (raceType.equalsIgnoreCase("DWARVES")) {
            return new Dwarves();
        }
        return null;
    }
}
