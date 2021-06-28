/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondemo.threadsafe;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Yurtsever
 */

public class SafeSingleton {
    private static SafeSingleton INSTANCE = null;
    
    String[] cities = {"Beauclair", "Novigrad", "Oxenfurt",
                        "Vizima", "Spikeroog", "Velen"};  
	
    private LinkedList<String> cityList = new LinkedList<> (Arrays.asList(cities));
      
    private SafeSingleton() {
    }
    
    public synchronized static SafeSingleton getInstance() {       
        // Threadler burada instance olusturmaya calisacak
        if (INSTANCE == null) {
            INSTANCE = new SafeSingleton();       
        }
                
        
        return INSTANCE;
    }

    public LinkedList<String> getCityList() {
        return cityList;
    }
    
    public LinkedList<String> getCities(int cityCount) {
        LinkedList<String> citiesCount = new LinkedList<>();
        
        for (int i=0; i< cityCount; i++) {
            citiesCount.add(INSTANCE.cityList.get(i));
            INSTANCE.cityList.remove(i);
            
        }    
        return citiesCount;
    }
}
