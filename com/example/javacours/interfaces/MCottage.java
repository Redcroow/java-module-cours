package com.example.javacours.interfaces;

public class MCottage extends MBuilding implements IFlyable{
    public MCottage() {
        System.out.println("Cottage constructor");
    }

    public void build(String material) {
        System.out.println("Cottage build in : " + material);
    }

    @Override
    public void fly(String energy) {
        System.out.println("Cottage fly in : " + energy);
    }

    @Override
    public void boost(int n) {
        System.out.println("Cottage boost in : " + n);
    }
}
