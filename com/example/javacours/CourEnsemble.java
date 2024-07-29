package com.example.javacours;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CourEnsemble {
    /*
        HashSet : pas de doublons, not thread-safe, accès direct
        ==========
        hashCode()
        equald()

        TreeSet : pas de doublons, not thread-safe, ordonnée, pas d'accès direct
        ===========
        compare()
        compareTo()
     */
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add(1);
        hashSet.add(-5);
        hashSet.add(385);

        hashSet.remove(-5);

        if (hashSet.contains(-5)) {
            System.out.println("il y a -5");
        }else {
            System.out.println("il n'y a pas -5");
        }

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------------------");

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(-5);
        treeSet.add(385);
        treeSet.add(45);
        treeSet.add(75);

        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(5));
    }
}
