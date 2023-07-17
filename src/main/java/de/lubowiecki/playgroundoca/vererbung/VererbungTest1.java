package de.lubowiecki.playgroundoca.vererbung;

import java.util.ArrayList;
import java.util.List;

public class VererbungTest1 {

    public static void main(String[] args) {

        Tier t1 = new Tier();
        System.out.println("Ist lebendig: " + t1.isLebendig());
        System.out.println("Name: " + t1.getName());

        t1.setLebendig(true);
        t1.setName("Max");

        System.out.println("Ist lebendig: " + t1.isLebendig());
        System.out.println("Name: " + t1.getName());

        System.out.println();

        Hund h1 = new Hund();
        h1.setRasse("Welsh Terrier");
        h1.setName("Watson");
        h1.setLebendig(true);

        System.out.println(h1.toString());
        System.out.println(h1.hashCode());
        // System.out.println(h1.machWas()); // Methode wurde in der ganzen Vererbungsfolge nicht gefunden

        System.out.println();

        Katze k1 = new Katze();
        k1.setVerbrauchteLeben(1);
        k1.setName("Bob");
        k1.setLebendig(true);

        System.out.println(k1);


        // Auf eine Referenz vom Typ einer Elternklasse können verschiedene Objekte ihrer Kindklassen abgelegt werden
        List<Tier> tiere = new ArrayList<>();
        tiere.add(h1); // Hund IS-A Tier
        tiere.add(k1); // Katze IS-A Tier
        // tiere.add(new Mensch()); // Mensch ist nicht von Tier abgeleitet

        System.out.println();

        // Über eine Referenz kann ich NUR Methoden benutzen, in in der Klasse definiert sind
        for(Tier t : tiere) {
            // System.out.println(t.getName()); // Name ist in Hund und Katze verfügbar
            System.out.println(t); // toString - die Methoden werden auf dem Original-Objekt auf dem Heap ausgeführt
        }

        System.out.println();

        Mensch m1 = new Mensch();
        m1.setVorname("Peter");
        m1.setNachname("Parker");
        m1.setLebendig(true);

        System.out.println();

        print(h1);
        print(k1);
        print(m1);

        print("Das ist ein Haus von Nikigraus"); // String ist auch ein Object
        print(12345); // int Autoboxing zu Integer -> Integer ist auch ein Object

        System.out.println();

        // Hund, Katze und Mensch sind Lebewesen
        print2(h1);
        print2(k1);
        print2(m1);

        // print2("Das ist ein Haus von Nikigraus"); // String ist KEIN Lebewesen
        // print2(12345); // int Autoboxing zu Integer -> Integer ist auch KEIN Lebewesen
    }

    public static void print(Object o) {
        System.out.println(o); // Über eine Objekt-Referenz sind nur Methoden von Object sichtbar
    }

    public static void print2(Lebewesen l) {
        // System.out.println(l); // Über eine Lebewesen-Referenz sind alle Methoden von Lebewesen (und ihrer Elterklassen) sichtbar
        l.getSound(); // Über eine Lebewesen-Referenz sind alle Methoden von Lebewesen (und ihrer Elterklassen) sichtbar
    }

}
