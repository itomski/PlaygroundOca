package de.lubowiecki.playgroundoca;

import java.util.Arrays;

public class Standardwerte {


    // Instanzvariablen werden mit Standardwerten initialisiert
    private boolean aktiv; // false

    // Instanzkonstanten müssen spätestens im Konstruktor initialisiert werden - werden nicht mit Standardwert belegt
    // private final boolean nichtAktiv;

    // Klassen werden mit Standardwerten initialisiert
    private static boolean ok; // false

    // Klassenkonstanten müssen spätestens im im Statischen-Initializer initialisiert werden - werden nicht mit Standardwert belegt
    private static final boolean raucher;

    static { // Statische-Initializer
        raucher = false;
    }

    public static void main(String[] args) {

        // Lokale Variablen werden nicht mit Standardwerten belegt
        // Sie können erst nach einer Initialisierung verwendet werden
        boolean b;
        // System.out.println(b); // Error:  b ist nicht initialisiert
        b = true;
        System.out.println(b); // kein Problem

        // Arrays werden mit Standard-Werten passenden Typs belegt
        boolean[] arr = new boolean[10];
        System.out.println(Arrays.toString(arr));

        int i = 1;
        if(i > 0) { // Bedingungen müssen ein boolisches Resultat haben
            //...
        }
    }
}
