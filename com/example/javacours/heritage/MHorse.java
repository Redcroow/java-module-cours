package com.example.javacours.heritage;


public class MHorse {
    // protected = private sauf pour les classe qui Herite de celle ci
    protected String name;
    protected int posX;
    protected int posY;

    public MHorse(String name) {
        this.name = name;
        this.posX = 50;
        this.posY = 50;
    }
    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
        System.out.println("L'animal moved at (X= " + this.posX + ", Y = " + this.posY + ")");
    }
}
