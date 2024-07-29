package com.example.javacours.interfaces;

public class MShip extends MVehicule implements IFlyable {
    public MShip() {
        this.movementSpeed = 16;
    }

    public void moveXY(int x, int y) {
        System.out.println("le navire se déplace en : " + x + ", y : " + y);
    }

    @Override
    public void fly(String energy) {
        System.out.println("le navire s'envole grace à : " + energy);
    }

    @Override
    public void boost(int n) {
        System.out.println("le navire se boost grace à : " + n);
    }

    @Override
    public void test() {
        System.out.println("Mon test");
    }
}
