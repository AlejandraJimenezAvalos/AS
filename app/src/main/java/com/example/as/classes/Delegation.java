package com.example.as.classes;

public class Delegation {
    private String delegation;
    private int sar;
    private int ris;

    public Delegation(String delegation) {
        this.delegation = delegation;
        this.sar = 0;
        this.ris = 0;
    }


    public void incrementSAR() {
        sar++;
    }

    public void incrementRIS() {
        sar++;
    }

    public String getDelegation() {
        return delegation;
    }

    public int getSar() {
        return sar;
    }

    public int getRis() {
        return ris;
    }
}
