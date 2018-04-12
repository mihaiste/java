/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mihaita
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemote extends UnicastRemoteObject implements MyRemoteInterface {
    int sum=0;
    
    protected MyRemote() throws RemoteException {
        super();
    }
    
    public void add(int d) throws RemoteException {
        sum+=d;
    }
    
    public int getResult() throws RemoteException {
        return sum;
    }
}