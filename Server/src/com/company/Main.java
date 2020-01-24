package com.company;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            LocateRegistry.createRegistry(1099);
            System.setProperty("java.rmi.server.hostname", "192.168.1.104");

            Infosaver infosaver = new Infosaver();
            Naming.rebind("site", infosaver);
            System.out.println("server is ...");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
