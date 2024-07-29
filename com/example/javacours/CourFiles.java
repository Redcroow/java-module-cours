package com.example.javacours;

import com.example.javacours.bases2.MPlayer;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
    PriorityQueue : ordonnée, accepte les doublons, refuse valeurs null, not thread-safe
    ArrayDeque : doublement chainé(utilisation des First Last, ordonnée, accepte les doublons, refuse valeurs null, not thread-safe
 */
public class CourFiles {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(155);
        pq.add(0);
        pq.add(8);
        pq.add(-1);
        pq.add(365);
        pq.add(0);

//        Iterator<Integer> it = pq.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        // Renvoie le premier élément de la queue sans le retirer
        System.out.println(pq.peek());

        // Retire et renvoie le premier élément de la queue
        System.out.println(pq.poll());

        System.out.println("-----------------------------------");

        // Doublement chainé
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.addFirst(4);
        dq.addFirst(13);
        dq.addLast(-1);

        dq.removeFirst();

        Iterator iterator = dq.iterator();

        while (iterator.hasNext()) {
            System.out.println((Integer) iterator.next());
        }
        System.out.println(" ");
        System.out.println(dq.getFirst());
    }
}
