package com.beadando.bevasarlobeadando;

public class Termekek {
    private String nev;
    private int egysegar;
    private double mennyiseg;
    private String mertekegyseg;

    public Termekek(String nev, int egysegar, double mennyiseg, String mertekegyseg) {
        this.nev = nev;
        this.egysegar = egysegar;
        this.mennyiseg = mennyiseg;
        this.mertekegyseg = mertekegyseg;
    }

    public String getNev() {
        return nev;
    }

    public int getEgysegar() {
        return egysegar;
    }

    public double getMennyiseg() {
        return mennyiseg;
    }

    public String getMertekegyseg() {
        return mertekegyseg;
    }

    public double getBruttoAr() {
        return Math.round(egysegar * mennyiseg * 100.0) / 100.0;
    }
}
