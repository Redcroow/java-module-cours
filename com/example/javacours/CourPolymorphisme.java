package com.example.javacours;

import com.example.javacours.interfaces.*;

/*
    Polymorphisme :
        -> permet de rendre le code plus flexible et réutilisable
        -> permet à une seule méthode d'agir différemment selon l'objet qui l'utilise
 */
public class CourPolymorphisme {
    public static void main(String[] args) {

        IFlyable[] elements = {new MShip(), new MShip(), new MCottage(), new MCottage()};

        for (IFlyable e : elements) {
            e.fly("essence");
        }
    }
}
