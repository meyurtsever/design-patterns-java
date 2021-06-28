/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondemo.threadsafe;

import java.util.LinkedList;

/**
 *
 * @author Yurtsever
 */ 
//170201088 - M. M. Enes Yurtsever

public class ThreadSafeMain {
    
    public static void main(String[] args) {
        Runnable getCities = new GetCities();
        Runnable getAnotherCities = new GetCities();
    
        new Thread(getCities).start();
        new Thread(getAnotherCities).start();
   
    }
}

class GetCities implements Runnable {

    public GetCities() {}

    @Override
    public void run() {
        SafeSingleton singletonInstance = SafeSingleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(singletonInstance));
    
        System.out.println(singletonInstance.getCityList());
        
        LinkedList<String> playerCityList = singletonInstance.getCities(2);
        System.out.println("Player: " + playerCityList);
        System.out.println("Player visited cities.");
        System.out.println("");
    }
}
