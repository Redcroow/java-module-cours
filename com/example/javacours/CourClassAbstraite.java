package com.example.javacours;

import com.example.javacours.abstraite.MLion;
import com.example.javacours.abstraite.MTiger;

/*
    une classe abstraite va servir à gagner du temps dans l'usage
        class abstraite = class avec une méthode au moins abstraite aussi
        on ne pourra pas instancié une class abstract
        elle permet de factoriser du code entre des classe etroitement lié
 */
public class CourClassAbstraite {
    public static void main(String[] args) {
        MTiger ti = new MTiger();
        System.out.println(ti.whoAmI());
        ti.speak();

        MLion li = new MLion();
        System.out.println(li.whoAmI());
        li.speak();
    }
}
