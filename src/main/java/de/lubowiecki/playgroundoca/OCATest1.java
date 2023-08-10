package de.lubowiecki.playgroundoca;

import java.io.IOException;
import java.util.Arrays;

public class OCATest1 {

    { // Instanz-Initializer, wird vor dem Konstruktor bei der Objekterzeugung ausgeführt
        int[] arr = new int[10];
        arr[10] = 15;
    }

    static { // Static-Initializer, wird vor beim Laden der Klasse ausgeführt
        //int[] arr = new int[10];
        //arr[10] = 15;
    }

    public static void main(String[] args) {

        long[][] l2d = {{1,2}, {3,4}, {5,6}};
        l2d[0][0] = 10;
        l2d[0] = new long[10];

        long[] l1d = {5,6};
        Object o = l1d;
        long[] newL1d = (long[])o;

        String s = "Hallo";
        Object o2 = s;
        String s2 = (String)o2; // OK. Auf dem Heap steht hinter o2 ein String
        //Integer i = (Integer)o2; // ClassCastException da o2 nicht auf einen Integer zeigt

        int arr[][][] = {{{1,2,3}, {4,5,6}}};
        // arr = new int[1][2][3];

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};

        System.out.println(Arrays.equals(arr1, arr2));
        //System.out.println(Arrays.deepEquals(arr1, arr2)); // Es wird equals auf den Inhalten ausgeführt. Inhalte müssen komplex sein

        try {
            System.out.println("Hi");
        }
        catch(RuntimeException e) { // RuntimeExceptions können IMMER auftauchen und gecatcht werden
            e.printStackTrace();
        }

        try {
            System.out.println("Hi");
        }
        catch(Exception e) { // Exceptions ist checked, kann aber IMMER gecatcht werden
            e.printStackTrace();
        }

        /*
        try {
            System.out.println("Hi");
        }
        catch(IOException e) { // Andere checked Exceptions können NUR gecacht werden, wenn sie im try geworfen werden (können)
            e.printStackTrace();
        }
        */

        try {
            machWasAnderes();
        }
        catch (Exception e) {
            System.out.println("... vor langer, langer Zeit... gab es mal ein Problem...");
        }

        String eingabe = "B";

        switch(eingabe) {
            case "A": {
                String str = eingabe.toUpperCase();
            }

            case "B": {
                String str = eingabe.toUpperCase();
            }

            case "C":
        }

        String x = null;

        // if(x != null & x.length() > 5) { // NullPointerException bei x.length()
        // }

        if(x != null && x.length() > 5) {

        }

        int i = 10;
        int j = 25;
        System.out.println(i & j); // BitWiseAnd
        //10: 00001010
        //25: 00011001
        //8 : 00001000

        // System.out.println(i && j); // Nur mit boolean möglich
        // System.out.println(i > 5 && j < 100); // Ok

    }

    private void machWas() throws IOException { // Hier kann auch eine Exception deklariert werden, die in der Methode gar nicht auftaucht

    }

    private static void machWasAnderes() {
        throw new RuntimeException(); // Muss in dieser Methode nicht behandelt oder deklariert werden
    }

}
