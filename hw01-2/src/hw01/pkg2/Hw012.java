/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw01.pkg2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihaita
 */
public class Hw012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Printing prt = new Printing(1,5);
        ArrayList<Printing> prt_list = new ArrayList<Printing>();
        
        for(int i=1;i<=6;i++)
            prt_list.add(new Printing(i,(int) (Math.random()*39+1)));
        
        for(int i=0;i<=5;i++)
            prt_list.get(i).start();
        
        for(int i=0;i<=5;i++)
            try {
                prt_list.get(i).join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Hw012.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
