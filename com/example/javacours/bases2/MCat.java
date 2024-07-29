package com.example.javacours.bases2;

public class MCat {
    // attribut = des variable propre à une class
    private String catName;
    private int catAge;


    // constructeur
    public MCat(String name, int age) {
        // association des valeur lié a la class cat avec ce qu'on recoit à l'appel du constructeur
        this.catName = name;
        this.catAge = age;

        System.out.println("Cat : " + this.catName + ", age : " + this.catAge);
    }
}

