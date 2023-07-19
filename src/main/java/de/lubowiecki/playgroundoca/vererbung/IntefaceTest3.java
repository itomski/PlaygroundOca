package de.lubowiecki.playgroundoca.vererbung;

public class IntefaceTest3 {

    public static void main(String[] args) {

        // IntBox ib1 = new IntBox(); // Interfaces können nicht instanziert werden

        // ConcretIntBox IS-A IntBox
        IntBox ib1 = new ConcretIntBox();
        System.out.println(ib1);

        // ConcretIntBox IS-A AbstractIntBox
        AbstractIntBox aib1 = new ConcretIntBox();
        System.out.println(aib1);

        ConcretIntBox cib1 = new ConcretIntBox();
        System.out.println(cib1);

        System.out.println(ib1 instanceof Object);
        System.out.println(ib1 instanceof IntBox);
        System.out.println(ib1 instanceof AbstractIntBox);
        System.out.println(ib1 instanceof ConcretIntBox);
        // System.out.println(ib1 instanceof String); // Error: String ist final, hat keine Kindklassen


    }
}

interface IntBox {

    void set(int i);

    int get();

    // Abstrakte Methoden im Interface die, die gleiche Signatur haben, wie Methoden aus Object
    // müssen NICHT implementiert werden - Da sie bereits vorhanden sind
    String toString();

    // Default Methoden dürfen keine Methoden von Object überschrieben
    // Methoden von Object (toString, hashCode, equals, wait, notify etc.)
    /*
    default int hashCode() {
        return 0;
    }
    */
}

abstract class AbstractIntBox implements IntBox {

    // Die Deklaration einer abstrakten Methode von Object
    // Verpflichtet die Kindklasse diese zu überschreiben
    @Override
    public abstract String toString();
}

class ConcretIntBox extends AbstractIntBox {

    private int value;

    @Override
    public void set(int i) {
        this.value = i;
    }

    @Override
    public int get() {
        return value;
    }

    @Override
    public String toString() {
        return "ConcretIntBox{" +
                "value=" + value +
                '}';
    }
}
