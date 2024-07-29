package com.example.javacours.bases2;

public class MPlayer {
    private String name;
    private int level;

    public MPlayer() {
        this.name = "Inconnu";
        this.level = 0;
        System.out.println("Player : " + this.name + " level: " + this.level);
    }

    public MPlayer(String name) {
        this.name = name;
        this.level = 0;
        System.out.println("Player : " + this.name + " level: " + this.level);
    }

    public MPlayer(String name, int level) {
        this.name = name;
        this.level = level;
        System.out.println("Player : " + this.name + " level: " + this.level);
    }

    public void attak() {
        System.out.println(this.name + " attaque une cible !");
    }
}
