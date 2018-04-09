/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw02.pkg1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihaita
 */
public class ServerTask extends Thread {
    Socket sock;
    
    public ServerTask(Socket sock){
        this.sock=sock;
    }
    
    public void task(){
        try {
            PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            
            while(true){
                String str=in.readLine();
                System.out.println(str);
                
                if(str.equals("END"))
                    break;
                out.write(str+"\n");
                out.flush();
            }
                out.close();
                in.close();
                sock.close();
        } catch (Exception ex) {
            
        }
    }

    @Override
    public void run() {
        task();
    }
    
    
}
