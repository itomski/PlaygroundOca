package de.lubowiecki.playgroundoca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScopeTest {

    // Klassenvariablen: Ab Laden der Klasse bis zum Ende des Programms verfügbar
    private static int zahl = 100;

    // Instanzvariablen: Ab Objekterzeugung bis das Objekt für GC zur Verfügung steht
    private int andereZahl = 200;

    private static final String[] NAMES = {"Peter", "Carol", "Bruce", "Steve", "Natasha", "Tony"};

    private static final Random RAND = new Random();


    public static void main(String[] args) {
        // Methodenparametet sind auch lokale Variablen

        // Lokale Variablen: Verfügbar bis zum Ende der Methode
        int i = 300;

        {
            // Lokale Variablen in einem Block: Verfügbar bis zum Ende des Blocks
            // Sichtbar innerhalb des Blocks und seinen Unterblöcken
            int j = 400;

            { // Unterblock
                System.out.println(j);
            }

            boolean ok = false;
            while(ok) { // Unterblock (if, else-if, switch, for, etc.)
            }

            if(ok) System.out.println(j); // Ohne Klammern gehört nur die nächste Anweisung zum Block

            if(ok); // Block wird durch das Semikolom beendet

            /*
            if(ok);
                System.out.println("OK");
            else // Error
                System.out.println("NICHT OK");
            */
        }

        // System.out.println(j); // Error: j ist Out-Of-Scope, da der Block beendet ist


        for (int j = 0; j < 10; j++) {
            System.out.println(j);
            // int j = 10; // Redeklaration - NICHT erlaubt
        }

        // System.out.println(j);

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        // Definition einer lokalen Variable
        // Lokale Variablen überlagern in Methoden die Klassen und Instanzvariablen
        int zahl = 500;
        System.out.println(zahl); // Lokale Variable wird verwendet
        //System.out.println(this.zahl); // Instanzvariable: Nur in Instanzmethoden verfügbar
        System.out.println(ScopeTest.zahl); // Klassenvariable


        List<String> namen = generateNames(100);
        System.out.println(namen);

        String[] namenArr = generateNamesArr(100);
        System.out.println(namenArr[0]);

    }

    public static void machWas() {
        System.out.println("START");
        return;
        // System.out.println("ENDE"); // Error
    }

    public static void machWasAnderes(boolean exit) {
        System.out.println("START");
        if(exit) {
            return;
        }
        System.out.println("ENDE");
    }

    public static int machWasGanzAnderes(boolean exit) {
        System.out.println("START");
        if(exit) {
            return 0;
        }
        System.out.println("ENDE");
        return 1;
    }

    public static List<String> generateNames(int num) {

        List<String> namen = new ArrayList<>(); // Leere Liste
        for (int i = 0; i < num; i++) {
            namen.add(NAMES[RAND.nextInt(6)]);
        }
        return namen;
    }

    public static String[] generateNamesArr(int num) {
        //return null; // Kann bei komplexen Rückgabetypen zurückgegeben werden
        // Wenn eine Exception geworfen wird, kann man kein return definieren
        throw new UnsupportedOperationException("Methode ist noch nicht implementiert");
        //System.out.println("..."); // Error
    }
}
