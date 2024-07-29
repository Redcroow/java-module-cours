package com.example.javacours.interfaces;

public class MGlider extends MVehicule{
    public MGlider() {
        this.movementSpeed = 58;
    }

    public void moveXY(int x, int y) {
        System.out.println("Glider moveX: " + x + ", y : " + y);
    }

    public void fly() {

    }
}
