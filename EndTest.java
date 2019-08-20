/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endtest;
/**
 *
 * @author hholm12
 */
import java.util.*;
import java.util.Random; 
//import java.util.jbutton;
import endtest.UI;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class EndTest {
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        Random rand = new Random();
        int numUniv = 14000000;
        int rand_int1 = rand.nextInt(numUniv);
        System.out.println("Game begins in: ");
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Endgame: " + rand_int1); //Says title 
                              
        Scanner user = new Scanner(System.in);           //Ask name
        System.out.println("What's your alias?");
        String name = user.next();
        System.out.println("Hello "+ name);             //Greets player.
        
        System.out.println("What is your superpower?"); //Allows player to choose power.
        String power = user.next();
        if (rand_int1 > numUniv / 2)
            System.out.println("I suggest choosing the evil side."); //"Suggests a side to choose."
        else
            System.out.println("I suggest choosing the good side.");//"Suggests a side to choose."

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
//        jButton1 = new javax.swing.JButton();
  //      jButton2 = new javax.swing.JButton();
  
        
    }
    
}
