package de.lubowiecki.playgroundoca.kontrollstrukturen;

public class SwitchTest {

    public static void main(String[] args) {

        // Mögliche Werte für Switch
        // Ganzzahlenwerte (ohne long) und chars
        // String und Enums

        byte b = 10;
        int i = 10;
        long l = 10;
        String str = "b";

        switch(str.toUpperCase()) {

            // Die Cases müssen Einzigartig sein
            case "A":
                System.out.println("A");
                break;

            case "B":
            System.out.println("B");
                break;

            case "C":
            System.out.println("C");
                break;

            case "D":
            System.out.println("D");
                break;

            case "E":
            System.out.println("E");
                break;

            default: // Tritt ein, wenn keine anderer Fall zutrifft
                System.out.println("DEFAULT");
        }



        switch(b) { // b ist ein byte
            case 10:
                System.out.println("A");
                break;

            case 20:
                System.out.println("B");
                break;

            case 50:
                System.out.println("C");
                break;

            case 100:
                System.out.println("D");
                break;

            /*
            case 200: // zu hoch für ein byte
                System.out.println("E");
                break; */

            default:
                System.out.println("DEFAULT");
        }

        System.out.println();

        Wochentag tag = Wochentag.SAMSTAG;

        switch(tag) {

            case MONTAG:
                System.out.println("MO");

            case DIENSTAG:
                System.out.println("DI");

            case MITTWOCH:
                System.out.println("MI");

            case DONNERSTAG:
                System.out.println("DO");

            case FREITAG:
                System.out.println("FR");
                break;

            case SAMSTAG:
            case SONNTAG:
                System.out.println("Wochenende");
        }

        // in switch können als cases Compiletime-Konstanten verwendet werden
        final int a = 10; // Compiletime-Konstante

        final int c = 30;

        /*
        final int c; // Runtime-Konstante
        c = 100;
        */

        int input = 70;

        switch(input) {

            case a:
                System.out.println("MO");

            case a + a:
                System.out.println("DI");

            case c:
                System.out.println("MI");

            case a + c:
                System.out.println("DO");

            case c + c:
                System.out.println("FR");
                break;

            case c + 200:
                System.out.println("Wochenende");
        }

    }
}

enum Wochentag {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
}
