package org.example;

public class Main {
    public static void main(String[] args) {

        Dragon bete = new Dragon("prout", null, 110, 220, 36, 100, null);
        System.out.println(bete.getName());
        Thread prout = new Thread(bete);
        prout.start();

    }
}