package com.example.javacours.enumeration;

public enum Color {
    RED("Rouge", "FF0000"),
    GREEN("Vert", "00FF00"),
    BLUE("Bleu", "000FF");

    private String name;
    private String hex;

    private Color(String name, String hex) {
        this.name = name;
        this.hex = hex;
    }

    public String toString() {
        return this.name;
    }
}
