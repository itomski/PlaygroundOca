package de.lubowiecki.playgroundoca.vererbung;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnderesKartenSpiel extends KartenSpiel {

    // Geerbte Methoden, die geändert werden müssen, werden überschrieben

    // Überschreiben beim Interface heißt: Es muss eine Methode mit gleicher Signatur eingebaut werden
    // Überschreiben beim Klassen heißt: Es muss eine Methode mit gleicher Signatur redefiniert werden

    @Override
    public LinkedList<String> getCards() {
        // deck ist im KartenSpiel privat
        // getDeck liefert eine Referenz darauf
        List<String> deck = getDeck();

        LinkedList<String> hand = new LinkedList<>();
        for(int i = 0; i < 3; i++) {
            hand.add(deck.remove(0)); // Nimmt eine Karte vom deck und packt sie auf die Hand
        }
        return hand;
    }
}
