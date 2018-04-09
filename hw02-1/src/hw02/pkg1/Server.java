/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw02.pkg1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihaita
 */
public class Server {
    public static void main(String[] args){
        int portNumber = 60000;

        try { 
            ServerSocket serverSocket = new ServerSocket(portNumber);
            
            while(true){
                Socket clientSocket = serverSocket.accept();
                ServerTask t = new ServerTask(clientSocket);
                t.start();
            }
        } catch (Exception ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
