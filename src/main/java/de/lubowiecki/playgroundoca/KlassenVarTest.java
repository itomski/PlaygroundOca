package de.lubowiecki.playgroundoca;

public class KlassenVarTest {

    public static void main(String[] args) {

        // Static
        // Statische Methoden werden direkt auf der Klasse aufgerufen
        System.out.println(StaticRechner.add(10, 20));

        // System.out.println(InstanceRechner.add(10, 20)); // Kompilererror - ist eine Instanzmethode
        InstanceRechner rechner = new InstanceRechner(); // Klasse muss erstmal instanziert werden
        System.out.println(rechner.add(10, 20)); // Methode wird auf der Instanz aufgerufen
        System.out.println(rechner.add(17, 10));
        System.out.println(rechner.add(5, 18));

        InstanceRechner rechner2 = new InstanceRechner(); // Eine zweite Instanz
        System.out.println(rechner2.add(4, 18));
        System.out.println(rechner2.add(22, 7));

        System.out.println(); // Leerzeile

        System.out.println(rechner.getProtokoll());

        System.out.println();

        System.out.println(rechner2.getProtokoll());

    }
}

class InstanceRechner {

    private String protokoll = ""; // Jede Instanz hat ein eigenes Protokoll

    public double add(double a, double b) {
        double sum =  a + b;
        protokoll += a + " + " + b + " = " + sum + "\n"; // String erweitern
        return sum;
    }

    public String getProtokoll() {
        return protokoll;
    }
}

class StaticRechner {

    public static double add(double a, double b) {
        return a + b;
    }
}


