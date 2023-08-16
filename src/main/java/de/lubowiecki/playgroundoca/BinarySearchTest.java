package de.lubowiecki.playgroundoca;

import java.io.IOException;
import java.util.Arrays;

public class BinarySearchTest {


    public static void main(String[] args) {

        String[] arr = {"c", "Z", "A", "C", "e"};
        Arrays.sort(arr); // A, C, Z, c, e
        System.out.println(Arrays.binarySearch(arr, "5")); // -1

        // Integer[] x = new Integer[-10]; // NegativeArraySizeException
       // Integer[] x = new Integer[Integer.MAX_VALUE + 1]; // NegativeArraySizeException

        Integer[] x = new Integer[10];
        Object[] obj = x;
        // obj[2] = "Hallo"; // ArrayStoreException - Array auf dem Heap ist immer noch ein Integer-Array
        obj[2] = Integer.MAX_VALUE + 1; // Läuft über
        obj[3] = 1L; // ArrayStoreException
        System.out.println(Arrays.toString(obj));

        Integer[] x2 = (Integer[])obj;

        try {

        }
        catch(Exception e) {

        }

        // Deklaration einer Klasse ohne Namen, die das Interface implementiert
        // und sofort instanziert wird
        Machbar m = new Machbar() {};


    }

    class Inner {

    }
}

interface Machbar {

    /* default boolean equals(Object o) {
        System.out.println("A");
    } */

    //void machWas(boolean ausgabe);
}
