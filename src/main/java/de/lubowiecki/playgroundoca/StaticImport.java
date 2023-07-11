package de.lubowiecki.playgroundoca;

import java.time.Month;
import java.util.Arrays;

import static java.lang.Math.PI; // Importiert PI
import static java.lang.Math.pow; // Importiert die Methode pow
import static java.lang.Math.*; // Importiert alle statischen Eigenschaften und Methoden der Klasse Math
import static de.lubowiecki.playgroundoca.StaticRechner.*;
import static java.time.Month.*; // Importiert das statische Inventar des Enums Month

public class StaticImport {

    public static void main(String[] args) {

        double pi = Math.PI;
        System.out.println(pi);
        System.out.println(Math.PI);

        double erg = Math.pow(10, 2); // 10 hoch 2
        System.out.println(erg);
        System.out.println(Math.pow(10, 2));

        // Nach einem statischen Import ist das statische Inventar direkt nutzbar
        System.out.println(pow(10, 2));
        System.out.println(PI);
        System.out.println(abs(-123));

        // Verwendet die importierte statische Methode von StaticRechner
        System.out.println(add(10.2, 22.17));

        Month m1 = Month.AUGUST;
        // Nach einem statischen Import
        Month m2 = AUGUST;

        // Utility-Klassen haben nur statische Methoden und Eigenschaften
        // und können nicht instanziert werden
        // Arrays.sort();
        // Collections.sort();

        //double // primitiver Datentyp
        // Double // Wrapper-Typ der ein primitiven Wert als Objekt enthält

        double d1 = 100.0;
        Double d2 = 100.0;
        Double.parseDouble("256.10"); // macht aus einem String einen double

        d2 = d1; // Autoboxing von double zu Double
        d1 = d2; // Auto-Un-boxing von Double zu double


    }
}
