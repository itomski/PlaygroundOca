package de.lubowiecki.playgroundoca.vererbung;

// implements Machbar: Zusicherung, dass hier das Interface realisiert wird
// Realisieren: alle Methoden werden ausgeschrieben/ausprogrammiert
public class AddImpl implements Machbar {

    @Override
    public int runOperation(int a, int b) {
        return a + b;
    }
}
