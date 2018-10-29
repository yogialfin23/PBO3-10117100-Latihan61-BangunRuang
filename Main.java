package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
        Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();

        b.setR(7);
        System.out.println("Volume Bola : " + b.hitungVolume());

        t.setH(21);
        t.setR(10);
        System.out.println("Volume Tabung : " + t.hitungVolume());

        k.setR(14);
        k.setT(9);
        k.hitungSisiSelimut();
        System.out.println("Volume Kerucut : " + k.hitungVolume());
    }
}
