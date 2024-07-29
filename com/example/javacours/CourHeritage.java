package com.example.javacours;

import com.example.javacours.heritage.*;

public class CourHeritage {
    public static void main(String[] args) {
        MHorse h = new MHorse("Guero");
        h.move(156, 485);

        MPegasus p = new MPegasus("TYUuero");
        p.move(156, 145);
        p.fly(250);

        //permet de vérifier si p est bien de l'instance désiré ici pegasus
        if(p instanceof MPegasus) {
            System.out.println("c'est un pégase");
        }
    }
}
