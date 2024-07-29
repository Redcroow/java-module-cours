package com.example.javacours.generecite;

public enum Color {
    GREEN("Vert"),
    RED("Rouge"),
    BLACK("Noir");

    private String name;

    private Color(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
