package com.example.javacours;

import java.util.*;

public class CourException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // try/catch = permet de verifier du code et d'éviter les erreur dans le code + attraper les erreurs
        try {
            System.out.println("Année de naissance : ");
            int ann = sc.nextInt();
            System.out.println(ann);

        }catch (InputMismatchException e) {
            e.printStackTrace();  // affiche l'erreur exact
            System.out.println("erreur date de naissace " + e.getMessage());
        }
        /*
            On peux ajouter d'autre exception en les mettant à la suite :
            catch (Exception e) {

            }
        */
        // ce bloc sera dans tout les cas executé
        finally {
            System.out.println("ok");
        }


    }
}
