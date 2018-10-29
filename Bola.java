package com.company;

public class Bola extends BangunRuang {
    private double r;
    private double volume;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double hitungVolume() {
        this.volume = (4 * 3.14 * r * r * r)/3;
        return this.volume;
    }
}
