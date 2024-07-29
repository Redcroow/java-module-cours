package com.example.javacours;

import com.example.javacours.bases2.MCatCat;

import java.util.*;

/*
    ces 4 classe accepte les doublons, les valeurs null
        -> ArrayList : mono-thread, accès direct, optimisé pour la lecture
        -> LinkedList : optimisé pour l'insertions rapide
        -> Vector : multi-thread, accès direct(récupération de valeur avec les indice comme les array), optimisé pour la lecture
        -> Stack : LIFO, multi-thread

        Quelques méthodes :
            -> add() : Ajoute un élément à la collection
            -> addAll() : Ajoute tous les éléments d'une autre collection à la collection actuelle
            -> clear() : Supprime tous les éléments de la collection
            -> contains() : Vérifie si un élément est présent dans la collection
            -> isEmpty() : Vérifie si la collection est vide (n'a aucun élément)
*/
public class CourList {
    public static void main(String[] args) {
//        Vector<MCatCat> vCatList = new Vector<MCatCat>();
//        vCatList.add(c1);
//        vCatList.add(c2);
//        vCatList.add(c3);
//        for (MCatCat cat : vCatList) {
//            cat.meow();
//        }

        MCatCat c1 = new MCatCat("Toudoux");
        MCatCat c2 = new MCatCat("Popy");
        MCatCat c3 = new MCatCat("Maki");

        System.out.println("-----------------------------------");

        // ArrayList :
        // ce qu'on met ici <> c'est le type
        ArrayList<MCatCat> catList = new ArrayList<MCatCat>();

        catList.add(c1);
        catList.add(c2);
        catList.add(c3);

        for (MCatCat cat : catList) {
            cat.meow();
        }

        System.out.println("Taille : " + catList.size());
        // Récupère l'adresse emplacement
        System.out.println(catList.get(0));

        System.out.println("-----------------------------------");

        // Liste chainé :
        LinkedList<MCatCat> linkedCatList = new LinkedList<MCatCat>();
        // Pour ajouter supprimer les premier ou dernier element on ajoute First ou Last après la méthode : addFirst, removeFirst....
        linkedCatList.addFirst(c1);
        linkedCatList.addFirst(c2);
        linkedCatList.addFirst(c3);

        // quand on travail sur des liste chainé on utilise un iterator à la place d'une boucle for
        ListIterator<MCatCat> iteratorList = linkedCatList.listIterator();
        while(iteratorList.hasNext()) {
            iteratorList.next().meow();
        }

        System.out.println("-----------------------------------");

        // Les collection de pile : Stack
        Stack<MCatCat> stackCatList = new Stack<MCatCat>();
        stackCatList.push(c1);
        stackCatList.push(c2);
        stackCatList.push(c3);

        stackCatList.peek().meow();
    }
}
