package de.lubowiecki.playgroundoca;

public class Test6 {

    public static void main(String[] args) {

        String s = "Moin";

        //if(s = "ABC") {
        //}

        boolean b = false;

        if(b = true) {
        }

        Byte b2 = 100; // Autoboxing
        byte b3 = 120;

        // Long l1 = 100; // Error: Autoboxing von int auf Integer, Komplex Widening zu Number
        Long l1 = (long)100; // primitive casting zu long, Autoboxing von long zu Long
        long l2 = 100; // primitive widening

        //byte b4 = (byte)l1;
        byte b4 = (byte)(l1 + b2); // Wrapper werden ausgepackt und auf gleichen Typ gebracht

        Runnable aufgabe = () -> {
            String name = Thread.currentThread().getName();
            for(int i = 1; i <= 10_000; i++) {
                System.out.println(name + ": " + i);
            }
        };

        var zahl = 100;
        //zahl = "Moin";

        // Container für parallele Ausführung
        //new Thread(aufgabe).start();
        //new Thread(aufgabe).start();
        //new Thread(aufgabe).start();
        //new Thread(aufgabe).start();

        System.out.println("ENDE");

        //Test6 t6 = new Test6();
        Test6 t6 = null;
        t6.machWas();

        Tage t = null;
        Tage t2 = t.MO; // Im Kompilat steht Tage.MO
        System.out.println(t.MO.tag); // Tage.MO.tag im Kompilat
        System.out.println(t.DI.tag); // Tage.DI.tag im Kompilat

        System.out.println(Farben.RED.decRgb);
        System.out.println(Farben.RED.hexRgb);

    }

    public static void machWas() {
        System.out.println("Moin");
    }
}


enum Tage {

    MO("Montag"), DI("Dienstag", "XYZ"), MI("Mittwoch"), DO("Donnerstag"); // Alle Konstanten im ENUM sind static

    String tag;

    Tage(String t) { // Konstruktor. Wird beim Laden des ENUMs automatisch für jede Konstante aufgerufen
        tag = t;
    }

    Tage(String t1, String t2) { // Konstruktor. Wird beim Laden des ENUMs automatisch für jede Konstante aufgerufen
        tag = t1 + t2;
    }
}

enum Farben {

    WHITE("#FFFFFF", "255,255,255"), BLACK("#000000", "0,0,0"), BLUE("#0000FF", "0,0,255"), RED("#FF0000", "255,0,0"), GREEN("#00FF00", "0,255,0");

    final String decRgb;
    final String hexRgb;

    Farben(String hex, String dec) { // Konstruktor. Wird beim Laden des ENUMs automatisch für jede Konstante aufgerufen
        decRgb = dec;
        hexRgb = hex;
    }
}