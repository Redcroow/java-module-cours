package com.example.javacours;

public class CourBases {
    /*
        main = fonction par défault en java : !required!
        static = porté
        public = accessibilité
     */
    public static void main(String[] args) {
        // VARIABLE CONSTANTE OPERATEUR

        int ageUtilisateur = 0;
        // constante
        final float PI = 3.14F;
        // calcul
        int result = 4 + 5 * 2;

        ageUtilisateur = 28;

        System.out.println("age du user : "+ ageUtilisateur);
        System.out.println("recuperer le resultat :" + result);
        System.out.println("-----------------------------------");
        // -----------------------------
        // CONDITION

        int value = 25;

        if(value == 24 || value == 25) {
            System.out.println("value = 24 ou 25");
        }else {
            System.out.println("value incorrect");
        }

        int option = 1;
        switch (option) {
            case 1:
                System.out.println("option 1");
                break;

            case 2:
                System.out.println("option 2");
                break;

            default:
                System.out.println("autre");
                break;
        }
        System.out.println("-----------------------------------");
        // -----------------------------
        // BOUCLES
        int i = 0;
        int w = 0;

        // il va augmenter la valeur de i à chaque tour et afficher sa valeur jusqu'a ce qu'elle atteinde 5
        System.out.println("boucle while");
        while (i < 10) {
            System.out.println(i);
            i++;
            // si i atteint 5 tu continue en sautant cet valeur
            if(i == 5) {
                continue;
            }
            // si i atteint la valeur de  la boucle se stop
            if (i == 9) {
                break;
            }
        }

        // la partie dans le do se fera au moins une fois et fera le test après contrairement au while
        System.out.println("boucle do while");
        do {
            w++;
            if(w == 5) {
                continue;
            }
            System.out.println(i);
        }
        while (w < 10);

        // la boucle for est surtout utile dans le parcours de tableau
        System.out.println("boucle for");
        for(int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        System.out.println("-----------------------------------");
    }
}
