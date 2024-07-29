package com.example.javacours.generecite;

public class Fruit {
    private String name;
    private int quantity;

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Fruit(String name) {
        this.name = name;
        this.quantity = 1;
    }

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
