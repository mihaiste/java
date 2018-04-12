/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mihaita
 */
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main2 {
    public static void main(String[] args) throws RemoteException,
            NotBoundException, InterruptedException {
        
        Registry registry = LocateRegistry.getRegistry(7500);
        
        for(String s : registry.list()){
            System.out.println(s);
        }
        
        MyRemoteInterface remote = (MyRemoteInterface)
        registry.lookup("object");
    
        for(int i=0;i<10;i++){
            remote.add(15);
            System.out.print(remote.getResult());
            Thread.sleep(1500);
        }
    }
} 
