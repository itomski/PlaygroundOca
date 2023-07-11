package de.lubowiecki.playgroundoca;

import java.lang.reflect.Method;
import java.util.Date;

public class DepricatedTest {

    public static void main(String[] args) {

        // Alte Datumsklasse
        Date date = new Date(2000, 10, 15);
        System.out.println(date); // toString wird automatisch verwendet

        Person p = new Person();
        //p = null; // Referenz wird von dem Objekt auf dem Heap getrennt
        // Danach kann das Objekt vom Heap durch GC entfernt werden
        // Beim entfernen ruft GC die finalize-Methode des Objektes auf

        for(Method m : p.getClass().getMethods()) {
            System.out.println(m.getName());
        }

        System.gc(); // GC wird explizit gebeten aktiv zu werden

        System.out.println();

        Object o = new Object();
        System.out.println(o.hashCode()); // Ein int-Wert, der aus dem Inhalt errechnet wird
        System.out.println(o.toString()); // Konvertiert ein Objekt in einen String
        System.out.println(o.equals(p)); // Inhaltsvergleich: Haben beide Objekte den gleichen Zustand?
        System.out.println(o == p); // Referenzvergleich: Zeigen beide Referenzen auf das gleiche Objekt auf dem Heap?
        System.out.println(o.getClass()); // Liefert ein Objekt, dass die Klassendefinition enthält - Reflection API


    }
}
