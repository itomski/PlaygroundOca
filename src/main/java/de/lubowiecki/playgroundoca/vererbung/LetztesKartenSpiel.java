package de.lubowiecki.playgroundoca.vererbung;

import java.util.LinkedList;
import java.util.List;

public final class LetztesKartenSpiel extends KartenSpiel {

    @Override
    public List<String> getCards() { // Diese Methode MUSS eingebaut werden
        List<String> deck = getDeck();

        List<String> hand = new LinkedList<>();

        for(int i = 0; i < 10; i++) {
            hand.add(deck.remove(0));
        }
        return hand;
    }
}
