package com.example.javacours.abstraite;

public class MLion extends MFeline {
    public MLion() {
        name = "lion";
    }

    // Override = permet de modifier la fonction de base afin de la rendre différente ou mieux
    @Override
    public void eat() {
        System.out.println("Lion eat");
    }

    @Override
    public void sleep() {
        System.out.println("lion sleep moins que le tigre");
    }

}
