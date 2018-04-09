/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw01.pkg2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihaita
 */
public class Printing extends Thread{
    int ID, steps;
    
    public Printing(int ID,int steps){
        this.ID=ID;
        this.steps=steps;
    }
    
    public void allSteps(){
        for(int i=1;i<=steps;i++){
            Print(ID,steps,i);
            try {
                Thread.sleep((long) (Math.random()*990+10));
            } catch (InterruptedException ex) {
                Logger.getLogger(Printing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public synchronized static void Print(int ID, int steps, int crtStep){
        System.out.println("Thread with ID " + ID + " is at step " + crtStep + " out of " + steps);
    }
    
    public void run(){
        allSteps();
    }
    
}
