package de.lubowiecki.playgroundoca;

public class ScopeTest {

    // Klassenvariablen: Ab Laden der Klasse bis zum Ende des Programms verfügbar
    private static int zahl = 100;

    // Instanzvariablen: Ab Objekterzeugung bis das Objekt für GC zur Verfügung steht
    private int andereZahl = 200;

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


    }

}
