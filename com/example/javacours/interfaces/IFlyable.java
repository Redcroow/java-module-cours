package com.example.javacours.interfaces;

public interface IFlyable {

    public void fly(String energy);
    public void boost(int n);

    // methode par défault dans une interface permette d'implémenter exceptionnelement du code dans une interface
    default public void test() {
        System.out.println("test");
    }
}
