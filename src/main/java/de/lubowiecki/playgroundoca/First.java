package de.lubowiecki.playgroundoca;

// Alles was nicht im gleichen Package oder in java.lang liegt MUSS importiert werden
import java.time.LocalDate;
import java.util.LinkedHashSet;

/**
 * Unsere erste Java-Klasse
 */
public class First {

    public static void main(String[] args) { // Einstiegspunkt

        // Pascal-Case: DasIstEinHausVonNikigraus (Wird Klassen-, Interface- und Enum-Namen benutzt)
        // Camel-Case: dasIstEinHausVonNikigraus (Wird für Variablen- und Methoidennamen verwendet)
        // Snake-Case: Das_Ist_Ein_Haus_von_Nikigraus (wird in Java nicht benutzt)
        // Screaming-Snake-Case: DAS_IST_EIN_HAUS_VON_NIKIGRAUS (Wird für Konstanten verwendet)

        /* LinkedHashSet = Klasse
        String.format() = String: Klasse, format: Methode
        Math.PI = Math: Klasse, PI: Konstante */

        System.out.println("Hallo OCA!"); // sout
        // System.out.println(args[0]); // Liest die Position 0 des args-Arrays aus

        Person peter = new Person(); // Instanzierung = aus der Klasse wird ein Objekt gebaut
        peter.vorname = "Peter";
        peter.nachname = "Parker";
        //peter.geburtsDatum = "2000-10-01"; // Kompilererror: Kein LocalDate
        peter.geburtsDatum = LocalDate.of(2000, 10, 1);
        peter.groesse = 182; // 182 ist int-Literal
        peter.lebendig = true;

        Person carol /* Bla bla bla */ = new Person();
        carol.vorname = "Carol";
        carol.nachname = "Danvers";
        carol.geburtsDatum = LocalDate.of(1998, 5, 17);
        carol.groesse = 176;
        carol.lebendig = true;

        peter.sagHallo();

        peter.lebendig = false; // Änderung des Objektzustands
        peter.vorname = "Markus";

        // Methoden verwenden oder ändern den aktuellen Zustand des Objektes
        peter.sagHallo(); // Aufruf der Methoden. Erfolgt auf dem Objekt
        carol.sagHallo();

        int i = 100; // int Ganzzahl, lokale Variable
        double d = 10.0; // Fließkommazahlen

        peter = null; // Löst die Verlinkung zwischen Referen und Objekt
    }

    /**
     * Multipliziert die Eingabeparameter miteinander
     * @param a Erste Zahl
     * @param b Zweite Zahl
     * @return Ergebnis der Multiplikation
     */
    public int machWas(int a, int b) {
        return a * b;
    }
}

class Next {

}