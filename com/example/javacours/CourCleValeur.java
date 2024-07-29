package com.example.javacours;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CourCleValeur {
    /*
        HashMap : pas de doublons, not thread safe, accès direct, valeurs null (jusqu'a une clé nulle)
        TreeMap : pas de doublons, not thread safe, accès direct, ordonnée
     */
    public static void main(String[] args) {
        // type = cleé et valeur
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("1", "Marc");
        hashMap.put("2", "Luis");
        hashMap.put("15", "Marie");
        hashMap.put("4", "Julie");

        try {
            System.out.println(hashMap.get("1"));

            if (hashMap.containsKey("20")) {
                System.out.println(hashMap.get("20"));
            }else {
                System.out.println("ERREUR la clé n'existe pas");
            }

            for (String key : hashMap.keySet()) {
                System.out.println(key);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("-----------------------------------");

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(1, "Marc");
        treeMap.put(2, "Luis");
        treeMap.put(15, "Marie");
        treeMap.put(4, "Julie");
        treeMap.put(5, null);

        System.out.println(treeMap.get(4));
        for(Map.Entry<Integer, String> ent : treeMap.entrySet()) {
            System.out.println("Valeur : " + ent.getValue());
            System.out.println("Cle : " + ent.getKey());
            System.out.println("---");
        }
    }
}
