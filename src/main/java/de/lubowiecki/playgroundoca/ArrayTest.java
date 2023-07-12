package de.lubowiecki.playgroundoca;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        char[] zeichen1 = {'c', 'x', 'A', 'Y'}; // Erzeugt ein Array in passender Größe und befüllt es
        System.out.println(Arrays.toString(zeichen1));

        //zeichen1 = {'Z', 'a', 'N'}; // Error: diese Schreibweise ist NUR bei gleichzeitiger Deklaration möglich
        zeichen1 = new char[]{'Z', 'a', 'N'}; // So gehts

        char[] zeichen3;
        // zeichen3 = {'c', 'x', 'A', 'Y'}; // Error: Deklaration ist an einer anderen Stelle erfolgt
        zeichen3 = new char[]{'c', 'x', 'A', 'Y'}; // Ok


        char[] zeichen2 = new char[10]; // Erzeugt ein Array mit Größe 10 und befüllt es mit Standardwerten
        System.out.println(Arrays.toString(zeichen2));

        // Kompiletime-Konstante
        final boolean ok = true;

        // Runtime-Konstante
        final boolean aktiv;
        aktiv = true;

        if(ok) {
            System.out.println("OK");
        }

        if(aktiv) {
            System.out.println("Aktiv");
        }

        System.out.println("Ende");


    }

}
