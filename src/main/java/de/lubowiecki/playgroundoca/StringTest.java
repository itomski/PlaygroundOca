package de.lubowiecki.playgroundoca;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

    public static void main(String[] args) {

        // s1 Referenz
        // Hallo ist  ein String-Objekt auf dem Heap
        String s1 = "Hallo";
        s1 = s1 + " Welt"; // Manipulation erzeugt ein neues String Objekt auf dem Heap

        // String Literal Pool
        String s2 = "Hi"; // Hi landet im Pool
        String s3 = "Hi"; // Das Hi aus dem Pool wird referenziert

        String s4 = new String("Hi"); // Dieses Hi landet NICHT im Pool und liegt als Objekt auf dem Heap

        System.out.println();

        System.out.println(s2 == s3); // Referenzvergleich: Ist es das gleiche Objekt?
        System.out.println(s2 == s4); // Referenzvergleich
        System.out.println(s2.equals(s3)); // Inhaltsvergleich: Hat es den gleichen Zustand?
        System.out.println(s2.equals(s4)); // Inhaltsvergleich

        // Zwei Objekt, die per equals als gleich gelten MÜSSEN den gleichen HashCode liefern
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        // String hat Instanz- und Klassenmethoden
        s1 = s1.concat(" ABC"); // Verknüpft zwei Strings - Manipulation erzeugt ein neues String-Objekt
        s1 = s1.toUpperCase(); // Großbuchstaben
        System.out.println(s1.toLowerCase()); // Kleinbuchstaben
        System.out.println(s1);

        String val = "Peter";

        String out = String.format("Mein Name ist %s", val); // Liefert einen formatierten String
        System.out.println(out);

        System.out.printf("Mein Name ist %s \n", val); // Sofortige Ausgabe

        out = String.join(", ", "Peter", "Bruce", "Carol", "Natasha");
        System.out.println(out);

        List<String> namen = new ArrayList<>(); // Collection
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Natasha");
        out = String.join(" - ", namen);
        System.out.println(out);

    }
}
