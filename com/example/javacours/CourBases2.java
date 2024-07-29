package com.example.javacours;

import com.example.javacours.bases2.MCat;
import com.example.javacours.bases2.MPlayer;
import com.example.javacours.bases2.MSoftwareRegistration;

// dans la classe principale si on créer des methode elles doivent etre en public static (regle)
public class CourBases2 {

    public static void main(String[] args) {
        // instencié = créer un objet à partir d'une classe
        // cours construction d'une classe + attribut
        MCat hina = new MCat("Hinaa", 3);
        MCat millow = new MCat("Millow", 5);
        System.out.println("-----------------------------------");
        // cours methode
        // Exemple 1
        String message = "Hello";
        message = say(message, 2);
        System.out.println(message);
        System.out.println("-----------------------------------");
        // Exemple 2 : surcharge de methode
        System.out.println(sum(2,5));
        System.out.println(sum(2.3,5.6));
        System.out.println("-----------------------------------");
        // Exemple 3 :
        MPlayer MPlayer1 = new MPlayer();
        MPlayer MPlayer2 = new MPlayer("Jason");
        MPlayer MPlayer3 = new MPlayer("Kilian", 5);
        MPlayer1.attak();
        System.out.println("-----------------------------------");
        // cours encapsulation de donnée
        // variable de classe = qui ne nécesiite pas d'instance
        System.out.println("Enregistrement : "+ MSoftwareRegistration.getNumberOfRegistrations());
        System.out.println(" ");
        MSoftwareRegistration sr = new MSoftwareRegistration(2026);
        sr.setExpirationYear(2050);
        System.out.println("Software registration expiration year: " + sr.getExpirationYear());
        System.out.println(" ");
        MSoftwareRegistration sr2 = new MSoftwareRegistration(2022);
        System.out.println("Software registration expiration year: " + sr2.getExpirationYear());
        System.out.println("Enregistrement : "+ MSoftwareRegistration.getNumberOfRegistrations());
    }
    // Exemple 1
    public static String say(String msg, int nb) {
        System.out.println(msg);
        msg = "world";
        return msg;
    }

    // return arrete la méthode
    public static int getNumber() {
        boolean info = true;
        if (info) {
            return 1;
        }else  {
            return 0;
        }
    }

    // Exemple 2 : surcharge de methode
    // java va choisir la bonne methode en fonction des donnée qu'il aura
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

}
