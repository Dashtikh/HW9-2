package com.company;

import Remote.SiteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        SiteInterface siteInterface = (SiteInterface) Naming.lookup("//192.168.1.104/site");
        int menu, money, cost;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("for pardakht 1 / for vahed 2");
            menu = scanner.nextInt();
            if (menu == 1) {
                Scanner mscanner = new Scanner(System.in);
                Scanner cscanner = new Scanner(System.in);
                System.out.println("meghdare pole khod ra vared konid");
                money = mscanner.nextInt();
                System.out.println("meghdare shahrie ra vared konid");
                cost = cscanner.nextInt();
                try {
                    System.out.println(siteInterface.pardakht(money, cost));
                } catch (Exception e) {
                    e.printStackTrace();
                }


            } else if (menu == 2) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("vahed haye khod ra vred konid !");
                String vahed = scanner1.nextLine();
                try {
                    System.out.println(siteInterface.vahed(vahed));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
