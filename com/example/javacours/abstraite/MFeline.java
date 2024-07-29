package com.example.javacours.abstraite;

public abstract class MFeline {
    protected String name;

    public String whoAmI() {
        return name;
    }

    abstract public void eat();
    abstract public void sleep();
    public void speak() {
        System.out.println("Roaaarrr !!");
    };
}
