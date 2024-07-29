package com.example.javacours.generecite;

public class Vegetable {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Vegetable(String name, Color color) {
        this.name = name;
        this.color = String.valueOf(color);
    }

    @Override
    public String toString() {
        return "Vegetable{" + "name=" + this.name + ", color=" + this.getColor() + '}';
    }
}
