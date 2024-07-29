package com.example.javacours.abstraite;

public class MTiger extends MFeline {
    public MTiger() {
        name = "tiger";
    }

    // Override = permet de modifier la fonction de base afin de la rendre différente ou mieux
    @Override
    public void eat() {
        System.out.println("Tiger eat");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleep 16h par jour");
    }
}
