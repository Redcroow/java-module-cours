package com.example.javacours;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CourInput {

    /*
        deux manière de lire des donnéee entré par l'utilisateur (input like) :
            - BufferedReader -> synchorne, thread-safe : lecture de chaine de caractère (String)
                Quelques méthode :
                -> read() = lire un caractère
                -> readLine() = lire une chaine
                -> skip(N) = ignore un caractère

            - Scanner -> asynchrone, not thread-safe : lecture de donnée + parsing (vérifier)
                Quelques méthodes :
                -> nextLine() = lire une ligne
                -> nextChar() = lire un caractère
                -> nextByte() = lire un octet
                -> nextFloat() = lire un nombre flottant
                -> nextDouble() = lire un double
                -> nextInt() = lire un entier
                -> nextBoolean() = lire un booléen
     */
    // throws Exceptions = permet de dire que la méthode static peux avoir une erreur et du coup la fait disparaitre
    public static void main(String[] args) throws Exception {
        // Permet de lire ce que l'utilisateur tape au clavier
        InputStreamReader isr = new InputStreamReader(System.in);
        // Rend la lecture de ce que l'utilisateur tape plus rapide et efficace
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter your name: ");
        String name = br.readLine();
        System.out.println(name);

        System.out.println("-----------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);
    }
}
