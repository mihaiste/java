/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mihaita
 */
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMain {
    public static void main(String[] args) throws RemoteException,
            MalformedURLException, AlreadyBoundException {
        
        MyRemote myr=new MyRemote();
        Registry registry=LocateRegistry.createRegistry(2500);
        registry.bind("object", myr);
    }
} 
