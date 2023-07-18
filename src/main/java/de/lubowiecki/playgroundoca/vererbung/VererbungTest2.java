package de.lubowiecki.playgroundoca.vererbung;

public class VererbungTest2 {

    public static void main(String[] args) {

        // Referenztyp: Box (Superklasse, Parent)
        // Objekttyp: NextBox (Kindklasse, Child)
        Box b1 = new NextBox();

        // Polymorphisch
        b1.doSomething(); // Instanzmethoden werden IMMER auf dem Objekttyp aufgerufen
        // b1.doSomethingElse(); // Diese Methode ist über die Referenz von Box nicht sichtbar

        // Nicht polymorphisch
        System.out.println(b1.content); // Eigenschaften werden IMMER auf dem Referenztyp aufgerufen
        b1.doSomethingStatic(); // Klassenmethoden werden IMMER auf dem Referenztyp aufgerufen

        System.out.println();

        // Hiding (Eigenschaften und statische Methoden)

        NextBox b2 = (NextBox) b1; // Lässt sich casten, wenn der Objekttyp auf dem Heap wirklich NextBox ist
        b2.doSomething();
        b2.doSomethingElse(); // Hier ist die Methode sichtbar
        System.out.println(b2.content);
        b2.doSomethingStatic();
    }
}

class Box {

    String content = "BOX";

    void doSomething() {
        System.out.println("BOX doSomething()");
    }

    static void doSomethingStatic() {
        System.out.println("BOX doSomethingStatic()");
    }
}

class NextBox extends Box {

    String content = "NEXT BOX";

    @Override // Prüft, ob in der Elternklasse auch wirklich eine Methode mit gleicher Signatur enthalten ist
    void doSomething() {
        System.out.println("NEXT BOX doSomething()");
    }

    void doSomethingElse() {
        System.out.println("NEXT BOX doSomethingElse()");
    }

    static void doSomethingStatic() {
        System.out.println("NEXT BOX doSomethingStatic()");
    }
}
