package de.lubowiecki.playgroundoca.vererbung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class KartenSpiel {

    private static final List<String> karten = List.of("Ah", "Kh", "Qh", "Jh", "10h", "As", "Ks", "Qs", "Js", "10d", "Ad", "Kd", "Qd", "Jd", "10d", "Ac", "Kc", "Qc", "Jc", "10c");

    private final List<String> deck;

    public KartenSpiel() {
        this.deck = new ArrayList<>(karten);
        Collections.shuffle(this.deck);
    }

    public abstract List<String> getCards(); // Abstrakte Methoden müssen das Schlüsselwort abstract tragen

    public static void printCard(List<String> karten) {
        System.out.println(karten);
    }

    // Diese Methode darf in Kindklassen nicht überschrieben werden
    public final List<String> getDeck() {
        return deck;
    }
}
