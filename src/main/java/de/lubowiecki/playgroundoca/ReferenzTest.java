package de.lubowiecki.playgroundoca;

public class ReferenzTest {

    public static void main(String[] args) {

        int a = 10;
        machWas(a);
        System.out.println(a); // Original ist unverändert

        System.out.println();

        a = machWasAnderes(a); // Der Zustand der veränderten Kopie wird wieder auf a geschrieben
        System.out.println(a);

        Buch buch = new Buch("Kochen ohne Fett", "1234-5678-91011", 19.99);
        aendereBuch(buch);
        System.out.println(buch);

        Buch buch1 = buch; // buch1 ist eine Referenz auf das gleiche Objekt, wie bei buch
        Buch buch2 = buch; // buch2 ist eine Referenz auf das gleiche Objekt, wie bei buch
        Buch buch3 = buch; // buch3 ist eine Referenz auf das gleiche Objekt, wie bei buch

        buch3.setIsbn("8910-1112-131415"); // Änderung erfolgt auf dem Original auf dem Heap
        System.out.println(buch);
        System.out.println(buch2);
        System.out.println(buch3);
    }

    // Immutable Objekte produzieren bei Veränderzung IMMER ein neues Objekt

    private static void machWas(int a) { // Kopie von dem Inhalt von a wird weiter gegeben
        ++a; // Kopie wird verändert
    }

    private static int machWasAnderes(int a) {
        return ++a;
    }

    private static void aendereBuch(Buch b) { //Referenz auf das gleiche Objekt wird weitergegeben
        b.setPreis(b.getPreis() + 10); // b ist eine Referenz auf das Original-Buch auf dem Heap
        // Änderungen über diese Referenz verändern das Original
    }
}

