package de.lubowiecki.playgroundoca;

import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {

        int[] arr = new int[10]; // ist mit Standardwert 0 gefüllt

        String[] strArr = new String[10]; // ist mit Null-Referenzen gefüllt

        System.out.println();

        // Durchlaufen mit Index
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        System.out.println();

        // Durchlaufen ohne Index
        for (String s : strArr) { // Bei der Iteration wir s jeweils mit dem aktuellen Wert gefüllt
            System.out.println(s);
        }

        // Lesen
        System.out.println(strArr[0]);

        // Schreiben
        strArr[0] = "Peter";

        System.out.println();

        // Mit Streams und Lambdas (Ab Java 1.8)
        Arrays.stream(strArr).forEach(s -> System.out.println(s));

        // Arrays = Utility-Klasse zur Verarbeitung von Arrays
        String out = Arrays.toString(strArr); // Konvertiert ein Array in einen String
        System.out.println(out);

        Arrays.fill(strArr, "Unbekannt"); // Befüllt das Array mit dem Wert "Unbekannt"
        strArr[8] = "bruce";
        strArr[9] = "Tony";
        strArr[1] = "Xenia";
        out = Arrays.toString(strArr);
        System.out.println(out);

        System.out.println();

        Arrays.sort(strArr); // für binarySearch muss das Array sortiert sein
        System.out.println(Arrays.toString(strArr));

        int i = Arrays.binarySearch(strArr, "bruce"); // liefert es die Position, an der Element gefunden wurde
        System.out.println(i);

        i = Arrays.binarySearch(strArr, "Tony");
        System.out.println(i);

        i = Arrays.binarySearch(strArr, "Xenia");
        System.out.println(i);

        // Wird ein Wert nicht gefunden, dann wird die voraussichtliche Position als Minuswert + -1 gelefert
        i = Arrays.binarySearch(strArr, "Natasha");
        System.out.println(i);

        //int a, b, c; // Erzeugt 3 int Variablen
        int a = 10, b = 20, c = 30; // Erzeugt 3 int Variablen mit voregebenen Werten
        //int a = 10, b = 20, c; // Auch möglich

        // Nur Deklaration
        //int[] x, y, z; // Erzeugt 3 int-Array Variablen
        int x, y[], z; // Erzeugt 2 int Variablen und eine int-Array Variable

        y = new int[10]; // y wird initialisiert
        z = 10;
    }
}
