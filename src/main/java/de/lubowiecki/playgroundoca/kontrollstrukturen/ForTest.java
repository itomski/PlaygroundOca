package de.lubowiecki.playgroundoca.kontrollstrukturen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForTest {

    public static void main(String[] args) {

        // Startwert i wird einmalig am Anfang der Schleife festgelegt
        // Bedingung wird jedes mal geprüft
        // Wenn wahr wird der Body abgearbeitet
        // danach wird der Zähler verändert

        for (int i = 0 ; i < 100; i++) {
            System.out.println(i);
        }
        // i ist am Ende der Schleife Out-Of-Scope

        System.out.println();

        // for (;;) { // Endlosschleife
        //     System.out.println("X");
        // }

        System.out.println();

        int j = 100; // Kann auch außerhalb der Schleife deklariert werden
        for (; j > 0; System.out.println(j--)) {
        }
        // j ist erst am Ende der Main-Methode Out-Of-Scope
        System.out.println("#:" + j);

        System.out.println();

        // Seit Java 10: Produziert eine Fixed-Size-Liste
        List<String> namen1 = List.of("Peter", "Carol", "Bruce", "Steve", "Tony");

        // Davor: Produziert eine Fixed-Size-Liste
        List<String> namen2 = Arrays.asList("Peter", "Carol", "Bruce", "Steve", "Tony");

        // namen3 ist jest in der Größe veränderbar
        List<String> namen3 = new ArrayList<>(namen2); // Übernimmt alle Inhalte aus namen2

        // in s wird jeweils das aktuelle Element hinterlegt
        for (String s : namen1) {
            System.out.println(s);
        }

        System.out.println();

        Iterator<String> itr = namen3.iterator();
        while(itr.hasNext()) { // Gibt es noch etwas zum durchiterieren?
            System.out.println(itr.next()); // Holt den nächsten Wert
        }

        System.out.println();

        namen3.forEach(System.out::println);

    }
}
