package com.example.javacours;
import java.util.Arrays;

public class CourArray {
    public static void main(String[] args) {
        // déclaration de tableau
        /*
            plusieurs manière :
            - int tab[] : déclaration d'un tableau de nom tab
            - int[] tab, tab2 : possibilité de déclarer plusieurs tableau
            - int tab[] = new int[x] : aucune valeur initialisé juste une déclaration
            - int tab[] = new int[]{1, 2, 3} : initialisé avec des valeur
            - int tab[] = {1, 2, 3} : initialisé avec des valeur
         */
        int tab[] = {1, 2, 3};

        // utilisation d'une boucle pour parcourir le tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        // pour chaque element e du tableau, tu parcours le tableau
        for(int e : tab) {
            System.out.println(e);
        }
        System.out.println("-----------------------------------");

        // Les tableau à 2Dimensions
        /*
            plusieurs manière :
            - int[][] matrix = new int[3][3];
            - int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
         */
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix[1][1]);

        // pour chaque element du tableau on parcours chaque element de notre ligne et on affiche chaque valeur
        for (int[] e: matrix) {
            for (int f: e) {
                System.out.println(f);
            }
        }

        System.out.println("-----------------------------------");

        // utilisation de methode
        int tab2[] = {1, 2, 3, 4, 5, 6};
        printTab(tab2);

        int tab3[] = new int[10];
        Arrays.fill(tab3, 0);
        printTab(tab3);
    }

    public static void printTab(int t[]) {
        for (int e : t) {
            System.out.println(e);
        }
        System.out.println("-----------------------------------");
    }
}
