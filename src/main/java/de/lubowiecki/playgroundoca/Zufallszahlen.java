package de.lubowiecki.playgroundoca;

import java.util.Random;

public class Zufallszahlen {

    public static void main(String[] args) {

        String s = "Hallo Random";
        String s2 = new String("Hallo");
        s2.concat("Xyz");

        System.out.println(Math.random()); // 0...1 wobei 1 nie erreicht wird
        System.out.println((Math.random() * 6));
        System.out.println((int) (Math.random() * 6)); // 0...6, excl. 6

        // Variante 1
        System.out.println((int) (Math.random() * 6) + 1); // 1...6

        System.out.println();

        Random rand = new Random();
        int erg = rand.nextInt(); // Zufallswert in gesamten Int-Wertebereich
        System.out.println(erg);

        erg = rand.nextInt(6); // Zufallswert in zwischen 0 und 6 (excl 6)
        System.out.println(erg);

        // Variante 2
        erg = rand.nextInt(6) + 1; // Zufallswert in zwischen 1 und 6
        System.out.println(erg);

        System.out.println();

        // Index im Array startet bei 0
        int[] zahlen = new int[10]; // Ein Ganzzahlen-Array für 10 Werte
        // Erstes Element zahlen[0]
        // letztes Element zahlen[9]

        int count = 100;

        for(int i = 0; i < zahlen.length; i++) {
            zahlen[i] = count++;
        }

        for(int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }

    public static int[] getArray() {
        int[] zahlen = new int[10];

        int count = 100;

        for(int i = 0; i < zahlen.length; i++) {
            zahlen[i] = count++;
        }

        return zahlen; // Gibt das ganze Array zurück
    }
}
