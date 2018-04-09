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
public class Client {
    public static void main(String[] args){
        String hostName = "localhost";
        
        int portNumber = 60000;

        try {
            Socket clientSocket = new Socket(hostName, portNumber);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Socket = " + clientSocket);
            
            for(int i=1;i<=10;i++){
                out.write("I am " + i + "\n");
                out.flush();
                String str = in.readLine();
                System.out.println(str);
                Thread.sleep(500);
            }
            
            out.write("END\n");
            out.close();
            in.close();
            clientSocket.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        
    }
    
}
