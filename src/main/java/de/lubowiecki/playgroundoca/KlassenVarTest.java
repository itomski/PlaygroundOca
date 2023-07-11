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

        // StaticRechner rechner3 = new StaticRechner(); // Instanzierung nicht möglich, Konstruktor ist private
        // rechner3.add(10, 20); // Kompiler ruft hier Rechner.add(10, 20) auf
        // Instanz ist nicht nötig!!!!

        System.out.println();

        // Nutzung der Singleton-Variante

        //SingletonRechner sr = new SingletonRechner(); // Error: Konstruktor ist privat
        SingletonRechner sr = SingletonRechner.getInstance();
        System.out.println(sr.add(10, 17));
        System.out.println(sr.add(22, 18));

        System.out.println();
        SingletonRechner sr2 = SingletonRechner.getInstance();
        System.out.println(sr2.add(10, 17));
        System.out.println(sr2.add(16, 19));

        System.out.println(SingletonRechner.getInstance().add(5,18));

        System.out.println();

        sr.getCount();
        sr2.getCount();

        machWas();

        SingletonRechner.getInstance().getCount();
    }

    private static void machWas() {
        System.out.println(SingletonRechner.getInstance().add(100, 300));
    }
}

class InstanceRechner {

    // Instanzvariable
    private String protokoll = ""; // Jede Instanz hat ein eigenes Protokoll

    // Nur Instanzmethoden können Instanzvariablen verwenden
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

    private StaticRechner() { // Verhindert eine Instanzierung
    }

    public static double add(double a, double b) {
        return a + b;
    }
}

class SingletonRechner {

    private int count;

    private static final SingletonRechner instance = new SingletonRechner(); // EAGER

    private SingletonRechner() {
    }

    public static SingletonRechner getInstance() {
        return instance;
    }

    public double add(double a, double b) {
        count++;
        return a + b;
    }

    public void getCount() {
        System.out.printf("Es wurden %d Rechnungen durchgeführt \n", count);
    }
}


