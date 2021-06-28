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

public class SingletonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Compile Time Error: The constructor Singleton() is not visible
        // Singleton singletonObject = new Singleton();
        
        // Get the only object available
        Singleton singletonObj = Singleton.getInstance();
        System.out.println("1st Instance ID: " + System.identityHashCode(singletonObj));
        singletonObj.getMessage();
        
        Singleton singletonObj2 = Singleton.getInstance();
        System.out.println("2nd Instance ID: " + System.identityHashCode(singletonObj2));
        singletonObj.getMessage();
               
    }
    
}
