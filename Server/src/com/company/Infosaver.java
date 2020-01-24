package com.company;

import Remote.SiteInterface;

import java.rmi.server.UnicastRemoteObject;

public class Infosaver extends UnicastRemoteObject implements SiteInterface {
    public Infosaver() throws Exception {
    }

    @Override
    public String pardakht(int money, int cost) throws Exception {
        String a = "pardakht shod - baghi mande pole shoma = " + (money - cost);
        System.out.println("used");
        return a;
    }

    @Override
    public String vahed(String vaheds) throws Exception {
        String a = "sabt gardid , vahed haye shoma " + vaheds;
        System.out.println("used");
        return a;
    }
}
