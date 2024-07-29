package com.example.javacours;
import java.util.StringTokenizer;

public class CourChaine {

    public static void main(String[] args) {
        // Cours les chaines de caractère
        /*
            classe String : immuable (contenue non modifiable)
            Les methodes :
                > concat() -> plus rapide que "+"
                > length() -> retourne le nombre de caractère
                > toUpperCase(), toLowerCase() -> met tout en majuscule|minuscule
                > trim() -> enleve les espace supprimé
                > replace("", "") -> remplace un caractère par un autre
                > charAt(x) -> accéder à un caractère comme pour acceder à une valeur d'un aray
                > substring(x, x) -> extraction de chaine
                > equals() -> compare deux chaine de caractère
                > compareTo() -> comparer les caractère de la table ascii avec les caractère des chaine

            classe StringBuilder | String Buffer : classe muable (modifiable)
            Les methodes :
                > length(), capacity() : capacity -> alocation de mémoire (elle changera en fonction de ce que contient la variable
                > append() : ajout  |   insert(x, "") -> ajout en précisiant l'indice

            StringBuilder (asynchrone)              -> Monothreadé : 1 thread = 1 voie tout se fera dans l'ordre d'arrivé
            StringBuffer  (synchrone, thread-safe)  -> Multithreadé : plusieurs voie
         */

        System.out.println("-----------------------------------");

        // SPLIT une chaine de caractère
        String s = "news/titre-de-la-news/14";
        StringTokenizer st = new StringTokenizer(s, "/");

        // tant qu'il y a des morceau de chaine à récuperer
        // on retourne le prochain morceau de chaine
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println("-----------------------------------");

        StringBuilder sBuilder = new StringBuilder("Bonjour");
        System.out.println(sBuilder.length());
        System.out.println(sBuilder.capacity());
        System.out.println(sBuilder.append(" monsieur"));
        System.out.println(sBuilder.insert(0, "Bonsoir "));

        System.out.println("-----------------------------------");

        // THREADS
    }
}
