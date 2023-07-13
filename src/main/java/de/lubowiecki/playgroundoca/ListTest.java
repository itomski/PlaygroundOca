package de.lubowiecki.playgroundoca;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        // Collections sind Sammlungen von Werten/Objekte

        // Eine Liste von Strings
        // Arbeitet wie ein Array mit einem Index, dieser startet bei 0
        // Behält die Einfügereihenfolge bei
        // Kann Duplikate enthalten
        // Erweitert sich automatisch

        // Referenztyp       // Objekttyp - Typ auf dem Heap
        // Interface         // Konkrete Klasse
        List<String> namen = new ArrayList<>(); // Leere Liste wird erzeugt
        namen.add("Peter"); // Neues Element wird in der Liste an die nächste freie Stelle abgelegt
        namen.add("Carol");
        namen.add("Bruce");
        System.out.println(namen);
        System.out.println(namen.size()); // Anzahl enthaltener Elemente
        namen.add(1, "Tony"); // Fügt Tony auf Index-Position 1 ein, der Rest rückt eine Position weiter
        System.out.println(namen);
        String altesElement = namen.set(1, "Steve"); // Ersetzt Element auf Index-Position 1
        System.out.println(namen);

        System.out.println();

        for (String n: namen) {
            System.out.println(n);
        }

        System.out.println();

        for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i)); // get liefert den Wert am gewünschten Index
        }

        System.out.println();

        namen.stream().forEach(n -> System.out.println(n));

        // Mehrdimensional
        List<List<String>> namen3;
        List<List<List<String>>> namen4;


        // Auch möglich
        // Konkrete Klasse         // Konkrete Klasse
        // ArrayList<String> namen2 = new ArrayList<>();


        // Collection nehmen keine primitive Datentypen auf!!!!
        // Für Primitive müssen Wrapper-Typen verwendet werden
        // Durch Auto-Boxing und Auto-Un-Boxing einfach umsetzbar

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(10); // primitiv wird durch Autoboxing zum Integer
        zahlen.add(15);
        zahlen.add(22);

        int zahl = zahlen.get(0); // Auto-Un-Boxing zum int

        List<Buch> buecher = new ArrayList<>();
        buecher.add(new Buch("Peter Pan", "1234", 10.99));
        buecher.add(new Buch("Der alte Mann und das Meer", "4567", 19.99));

        Buch b1 = new Buch("Backen ohne Mehl", "6789", 29.99);
        buecher.add(b1);

        System.out.println(buecher);

    }
}
