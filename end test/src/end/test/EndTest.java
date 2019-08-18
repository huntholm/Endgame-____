/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package end.test;
/**
 *
 * @author hholm12
 */
import java.util.*;
import java.util.Random; 


public class EndTest {
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
       int rand_int1 = rand.nextInt(14000000);
        System.out.println("Endgame: " + rand_int1); //Says title
        
        Scanner user = new Scanner(System.in);           //Ask name
        System.out.println("What's your alias?");
        String name = user.next();
        System.out.println("Hello "+ name);
        
        System.out.println("What is your superpower?");
        String power = user.next();
        
                
  
        
    }
    
}
