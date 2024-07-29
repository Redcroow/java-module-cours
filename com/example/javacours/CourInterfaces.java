package com.example.javacours;

import com.example.javacours.interfaces.MCottage;
import com.example.javacours.interfaces.MShip;

/*
    une interface c'est comme un contrat :
        -> définit des méthodes que les classes doivent implémenter sans dire comment ces méthodes doivent être faites
 */
public class CourInterfaces {
    public static void main(String[] args) {
        MCottage c = new MCottage();
        MShip s = new MShip();

        c.fly("Biomass");
        s.fly("Mana");

        c.test();
        s.test();
    }
}
