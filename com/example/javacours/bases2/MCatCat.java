package com.example.javacours.bases2;

public class MCatCat {
    private String catName;

    public MCatCat(String name) {
        this.catName = name;
    }

    public void meow() {
        System.out.println(this.catName + " Meow");
    }
}
