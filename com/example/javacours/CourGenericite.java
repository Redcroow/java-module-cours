package com.example.javacours;

import com.example.javacours.generecite.Basket;
import com.example.javacours.generecite.Color;
import com.example.javacours.generecite.Fruit;
import com.example.javacours.generecite.Vegetable;

import java.util.List;
import java.util.ArrayList;

public class CourGenericite {
    public static void main(String[] args) {
        Fruit f = new Fruit("Cerise", 15);
        Vegetable v = new Vegetable("Carotte", Color.RED);

        Basket<Fruit> basketf = new Basket<>(f);
        System.out.println(basketf.getItem().getName());

        Basket<Vegetable> basketv = new Basket<>(v);
        System.out.println(basketv.getItem().getName());
    }
}
