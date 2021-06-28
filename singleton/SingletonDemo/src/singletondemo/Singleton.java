/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondemo;

/**
 *
 * @author Yurtsever
 */

public class Singleton {
    
    private static Singleton INSTANCE = null;
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if (INSTANCE == null) 
            INSTANCE = new Singleton();
        
        return INSTANCE;
    }
    
    public void getMessage(){
        System.out.println("Singleton Design Pattern!");
    }
   
}
