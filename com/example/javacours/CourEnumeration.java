package com.example.javacours;

import com.example.javacours.enumeration.Color;

public class CourEnumeration {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        Color c2 = Color.RED;

        if (c1.equals(c2)) {
            System.out.println("Same Color");
        }

        System.out.println(c1.name());

        for (Color c : Color.values()) {
            System.out.println(c.toString());
        }
    }
}
